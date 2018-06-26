package quickstart.kotlin.chapter4.namedarguments

import quickstart.kotlin.chapter4.JavaNamedArguments
import kotlin.text.replace

import java.math.BigDecimal

fun namedArguments() {
    val str = "foo"
    val match = str.regionMatches(thisOffset = 0, other = "foo", otherOffset = 0, length = 3, ignoreCase = true)
}

fun namedArguments2() {
    val str = "foo"
    //compiler error
    val match = str.regionMatches(3, "foo", otherOffset = 0, 3, true)
}

fun namedArguments3() {
    val str = "foo"
    val match = str.regionMatches(3, "foo", otherOffset = 0, length = 3, ignoreCase = true)
}

fun namedArguments3() {
    JavaNamedArguments().foo(b = 1, a = 2)
}

class User(private val firstName: String,
           private val lastName: String,
           private val birthYear: Int)


fun s() {
    val user = User(birthYear = 1955, lastName = "Wayne", firstName = "Bruce")
}