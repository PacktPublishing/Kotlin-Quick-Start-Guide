package quickstart.kotlin.chapter6

val hello: String.() -> Unit = { print("Hello $this") }

fun callHello() {
    hello("Kotlin") // prints Hello Kotlin
}

fun buildString(init: StringBuilder.() -> Unit): String {
    val builder = StringBuilder()
    init(builder)
    return builder.toString()
}

fun callReceiverFunctions() {
    val string = buildString {
        append("Hello Receiver Functions")
        appendln("We have access to StringBuilder object inside this lambda")
    }
}