// Write a Java program to create a class Car that uses both default and parameterized constructors and applies the this keyword to differentiate instance variables from parameters.

class Car {
    String brand;
    int price;

    Car() {
        this.brand = "Unknown";
        this.price = 0;
    }

    Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println(brand + " " + price);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("BMW", 5000000);

        c1.display();
        c2.display();
    }
}