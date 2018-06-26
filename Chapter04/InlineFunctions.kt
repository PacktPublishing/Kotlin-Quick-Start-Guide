package quickstart.kotlin.chapter4

fun noInline(func: () -> String) {
    val str = func()
    println("Func produced: $str")
}

inline fun inlined(func: () -> String) {
    val str = func()
    println("Func produced: $str")
}

fun callInlined() {
    inlined { "Kotlin" }
}

fun callNotInlined() {
    noInline { "Kotlin" }
}

inline fun nothingToInline() {

}

var str: String
    inline get() = "Kotlin"
    inline set(value) {
        println("$value passed as parameter")
    }

var str2: String
    get() = "Kotlin"
    inline set(value) {
        println("$value passed as parameter")
    }

inline var str3: String
    get() = "Kotlin"
    set(value) {
        println("$value passed as parameter")
    }