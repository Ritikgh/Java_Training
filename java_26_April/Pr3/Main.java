class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car is charging");
    }
}

public class Main {
    public static void main(String[] args) {
        ElectricCar obj = new ElectricCar();

        obj.start();
        obj.drive();
        obj.charge();
    }
}