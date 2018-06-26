package quickstart.kotlin.chapter4

fun firstFunctionType(f: () -> String) {
    println(f.invoke())
}

inline fun secondFunctionType(crossinline f: () -> String) {
    firstFunctionType {
        f.invoke()
    }
}