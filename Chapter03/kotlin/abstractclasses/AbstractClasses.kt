package quickstartguide.kotlin.chapter3.kotlin.abstractclasses

abstract class BaseUser {
    abstract val name: String
    abstract fun login()

    fun logout() {
        println("Logging out")
    }
}

abstract class BaseUser {

    //compiler error
    abstract val name: String = ""

    //compiler error
    abstract fun login()  {

    }

    fun logout() {
        println("Logging out")
    }
}

class User(override val name: String) : BaseUser() {

    override fun login() {
        println("Logging out")
    }
}