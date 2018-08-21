package quickstart.kotlin.chapter6

interface Countable<T: Number> {
    fun count(): T
}

class IntCountable: Countable<Int> {
    override fun count(): Int {
        return 0
    }
}

//compiler error
class StringCountable: Countable<String> {
    override fun count(): String {
        return ""
    }
}

interface Countable2<T> where T: Number {
    fun count(): T
}

interface Countable3<T> where T: Number, T: Comparable<T> {
    fun count(): T
}