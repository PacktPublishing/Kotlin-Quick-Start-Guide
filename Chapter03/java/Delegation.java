package quickstartguide.kotlin.chapter3.java;

public interface Drivable {
    void drive();
}

public class Car implements Drivable {

    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}

public class Vehicle implements Drivable{
    private Car car;

    public Vehicle(Car car) {
        this.car = car;
    }

    @Override
    public void drive() {
        car.drive();
    }
}

public void driveVehicle() {
    Car car = new Car();
    Vehicle vehicle = new Vehicle(car);
    vehicle.drive(); // with delegation, car.drive() get's called
}