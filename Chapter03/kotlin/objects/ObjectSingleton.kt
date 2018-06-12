package quickstartguide.kotlin.chapter3.kotlin.objects

object Singleton {

    fun sayMyName() {
        println("I'm a singleton")
    }
}

fun cantCreateSingleton() {
    //compiler error
    val singleton = Singleton()
}

fun accessSingleton() {
    Singleton.sayMyName()
}


class Outer {
    object Singleton {

    }
}

object RunnableSingleton : Runnable {
    override fun run() {
        println("I'm a runnable singleton")
    }
}

object SingletonWithInitializer {
    var name = ""

    init {
        name = "Singleton"
    }
}