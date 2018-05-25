fun equality() {
    val a = "Kotlin"
    val b = "Kotlin"
    val c = "Java"

    println("Strings a and b are equal in content: ${a == b}")
    println("Strings b and c are equal in reference: ${b === c}")
}

fun main(args: Array<String>) {
    equality()
}