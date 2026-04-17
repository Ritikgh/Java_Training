// Write a Java program to create a class Laptop with multiple constructors and use this() to call one constructor from another and display the details.

class Laptop {
    String brand;
    int price;

    Laptop() {
        this("HP", 40000);
    }

    Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println(brand + " " + price);
    }

    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.display();
    }
}