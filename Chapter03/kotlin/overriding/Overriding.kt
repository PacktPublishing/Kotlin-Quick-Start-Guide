package quickstartguide.kotlin.chapter3.kotlin.overriding

open class Base {
    open fun print() {
        println("I'm called from the base type")
    }
}

class Derived : Base() {
    override fun print() {
        println("I'm called from the super type")
    }
}

open class Derived : Base() {
    final override fun print() {
        println("I'm called from the super type")
    }
}

open class User(open val name: String)

class AdminUser(override var name: String) : User(name)