package quickstartguide.kotlin.chapter3.kotlin.interfaces

interface Drivable {
    fun drive()
}

class Car : Drivable {
    override fun drive() {
        println("Driving a car")
    }
}


interface Flyable {
    fun climb() {
        println("Climbing")
    }

    fun fly()
}

class AirPlane : Flyable {
    override fun fly() {
        println("Flying a plane")
    }
}

class Drone : Flyable {
    override fun climb() {
        println("Climbing slowly")
    }

    override fun fly() {
        println("Flying a plane")
    }
}

interface Ridable {
    fun ride()

    val name: String
}
