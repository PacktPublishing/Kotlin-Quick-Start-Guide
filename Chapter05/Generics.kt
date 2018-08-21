package quickstart.kotlin.chapter6

val listOfStrings: List<String> = listOf()
val arrayListStrings: List<String> = ArrayList<String>()
val arrayListStrings: List<String> = ArrayList()
val arrayListStrings = ArrayList<String>()

interface Generic<T> {
    fun foo(t: T)
}

class IntGeneric: Generic<Int> {
    override fun foo(t: Int) {

    }
}


class GenericType<T>: Generic<T> {
    override fun foo(t: T) {

    }
}

class NonGeneric {

    fun <T> genericFunc(t: T) {
        println(t.toString())
    }
}

fun callGenericFunc() {
    val nonGeneric = NonGeneric()
    nonGeneric.genericFunc<String>("Kotlin")
    nonGeneric.genericFunc("Kotlin")
}

