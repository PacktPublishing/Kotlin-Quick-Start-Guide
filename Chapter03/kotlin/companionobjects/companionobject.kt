package quickstartguide.kotlin.chapter3.kotlin.companionobjects

import java.util.*

class User private constructor(val userId: String) {
    companion object {
        fun newUserWithEmail(email: String): User {
            return User(email)
        }

        fun newUserFromUUID(uuid: UUID): User {
            return User(uuid.toString())
        }
    }
}

val userFromEmail = User.newUserWithEmail("john@mail.com")
val userFromUUID = User.newUserFromUUID(UUID.randomUUID())

class Outer {
    companion object Inner {
        fun saySomething() {
            println("Hello")
        }
    }
}

fun accessCompanion() {
    Outer.saySomething()
}

class Static {
    companion object {

        // static method
        @JvmStatic
        fun staticFunction() {

        }

        // static field
        @JvmField
        val staticField = 0
    }
}