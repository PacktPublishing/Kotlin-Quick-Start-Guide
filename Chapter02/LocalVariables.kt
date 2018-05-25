fun immutable() {
    val bar: String = "Kotlin"
    bar = "Kotlin is awesome" // compiler error
}

fun mutable() {
    var bar: String = "Kotlin"
    bar = "Kotlin is awesome"
}

fun assignment() {
    val bar: String
    if (true) {
        bar = "Foo"
    } else {
        bar = "Bar"
    }
}