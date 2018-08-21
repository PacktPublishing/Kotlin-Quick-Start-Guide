package quickstart.kotlin.chapter6

fun <T> createInstance(): T {
    //compiler error
    return T::class.java.newInstance()
}

inline fun <reified T> createReifiedInstance():T {
    return T::class.java.newInstance()
}