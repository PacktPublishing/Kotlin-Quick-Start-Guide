package quickstartguide.kotlin.chapter3.kotlin.delegations

interface Drivable {
    fun drive()
}

class Car : Drivable {
    override fun drive() {
        println("Driving a car")
    }
}

class Vehicle(car: Car) : Drivable by car



interface Rideable {
    fun ride()
}

interface Chargable {
    fun charge()
}

class Battery : Chargable {
    override fun charge() {
        println("Charging")
    }
}

class Bike : Rideable {
    override fun ride() {
        println("Riding a bike")
    }
}

class ChargableBike(bike: Bike, battery: Battery): Rideable by bike, Chargable by battery