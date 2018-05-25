val long: Long = 9999L

val int: Int = 999

val short: Short = 99

val byte: Byte = 9



val float: Float = 9.99F

val double: Double = 9.99999

val hex: Int = 0XFF

val binary:Int = 0b1001001


val bool: Boolean = true

val bool2: Boolean = 1 > 100

val a: Char = 'a'

val s: String = "Kotlin"

class Person(val name: String, val birthYear: Int)

fun printPersonDetails(person: Person) {
    println("${person.name} was born in ${person.birthYear} year")
}

val multiLine: String = """
Hello Kotlin!
Nice to meet you!
"""

val squares = IntArray(10, { i -> (i + 1) * (i + 1) })