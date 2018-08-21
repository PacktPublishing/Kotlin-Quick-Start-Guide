package quickstart.kotlin.chapter6

import kotlin.properties.Delegates
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class LazyProperty<T>(private val valueFactory: () -> T) : ReadOnlyProperty<Any, T> {
    private var instance: T? = null

    override fun getValue(thisRef: Any, property: KProperty<*>): T {
        if (instance == null) {
            instance = valueFactory()
        }
        return instance!!
    }
}

fun <T> lazyProperty(valueFactory: () -> T) = LazyProperty(valueFactory)

class DelegatedProperties {
    private val str by lazyProperty { "I'm lazily initialized" }
    private val s by LazyProperty { "I'm lazily initialized" }
}


class StandardLibDelegateProperties {
    val str by lazy { "I'm lazily initialized" }

    var observable by Delegates.observable(1) { prop, oldVal, newVal ->
        println("Observable property changed from $oldVal to $newVal")
    }

    fun changeObservable() {
        //this prints Observable property changed from 1 to 0
        observable = 0
    }

    var vetoable by Delegates.vetoable(1) { prop, oldVal, newVal ->
        return@vetoable newVal <= 10
    }

    fun changeVetoable() {
        //change is blocked
        vetoable = 100

        //changed to 0
        vetoable = 0
    }

    var notNull by Delegates.notNull<Int>()

    fun callNotNull() {
        //this results in exception
        val n = notNull

        notNull = 1
        val num = notNull
    }


}