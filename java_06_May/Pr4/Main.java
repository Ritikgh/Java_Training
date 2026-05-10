
abstract class Vehicle {

    abstract void getMileage();
}

class Car extends Vehicle {

    void getMileage() {
        System.out.println("Car Mileage: 18 km/l");
    }
}

class Bike extends Vehicle {

    void getMileage() {
        System.out.println("Bike Mileage: 45 km/l");
    }
}

class Truck extends Vehicle {

    void getMileage() {
        System.out.println("Truck Mileage: 8 km/l");
    }
}

class Main {

    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.getMileage();

        Vehicle v2 = new Bike();
        v2.getMileage();

        Vehicle v3 = new Truck();
        v3.getMileage();
    }
}
