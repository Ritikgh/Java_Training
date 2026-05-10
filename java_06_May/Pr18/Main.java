interface Drive {
    void start();
    void stop();
}

class Car implements Drive {

    public void start() {
        System.out.println("Car Started");
    }

    public void stop() {
        System.out.println("Car Stopped");
    }
}

class Bike implements Drive {

    public void start() {
        System.out.println("Bike Started");
    }

    public void stop() {
        System.out.println("Bike Stopped");
    }
}

class Main {
    public static void main(String[] args) {
        Drive d = new Bike();
        d.start();
        d.stop();
        Drive d2 = new Car();
        d2.start(); 
        d2.stop();
    }
}