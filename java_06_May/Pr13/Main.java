interface Ride {
    void bookRide();
    void calculateFare(double distance);
}

class BikeRide implements Ride {

    public void bookRide() {
        System.out.println("Bike Ride Booked");
    }

    public void calculateFare(double distance) {
        double fare = distance * 10;
        System.out.println("Bike Fare: " + fare);
    }
}

class CarRide implements Ride {

    public void bookRide() {
        System.out.println("Car Ride Booked");
    }

    public void calculateFare(double distance) {
        double fare = distance * 20;
        System.out.println("Car Fare: " + fare);
    }
}

class AutoRide implements Ride {

    public void bookRide() {
        System.out.println("Auto Ride Booked");
    }

    public void calculateFare(double distance) {
        double fare = distance * 15;
        System.out.println("Auto Fare: " + fare);
    }
}

class Main {
    public static void main(String[] args) {

        Ride r1 = new BikeRide();
        r1.bookRide();
        r1.calculateFare(5);

        Ride r2 = new CarRide();
        r2.bookRide();
        r2.calculateFare(10);

        Ride r3 = new AutoRide();
        r3.bookRide();
        r3.calculateFare(7);
    }
}