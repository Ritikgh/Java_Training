// Write a Java program to create a class Product that uses constructor overloading, the this keyword, and multiple objects to initialize and display product details.

class Product {

    int id;
    String name;
    double price;

    Product() {
        this(1, "Default", 100);
    }

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(id + " " + name + " " + price);
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(2, "Laptop", 50000);

        p1.display();
        p2.display();
    }
}
