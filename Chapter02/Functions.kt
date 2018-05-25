fun add(a: Int, b: Int): Int {
    val result: Int = a + b
    return result
}

fun fileLevelFunctions() {
    println("I'm declared without a class")
}

fun addAsExpression(a: Int, b: Int): Int = a + b

fun printToConsole(input: String): Unit {
    println(input)
}

fun printToConsole2(input: String) {
    println(input)
}