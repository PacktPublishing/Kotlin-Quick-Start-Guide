package quickstartguide.kotlin.chapter3.kotlin.dataclasses.kotlin

data class User(var firstName: String,
                var lastName: String,
                var birthYear: String)

fun copyInDataClass() {
    val user = User("Bruce", "Wayne", "1965")
    val userCopy = user.copy("John")
}

fun copyInDataClassNamedArg() {
    val user = User("Bruce", "Wayne", "1965")
    val userCopy = user.copy(firstName = "John")
}