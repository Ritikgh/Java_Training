// 5. Write a Java program to implement a **copy constructor** in a class Book that copies data from one object to another.

class Book {
    String name;
    double price;

    Book(String n, double p) {
        name = n;
        price = p;
    }

    // Copy constructor
    Book(Book b) {
        name = b.name;
        price = b.price;
    }

    void display() {
        System.out.println(name + " " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java", 500);
        Book b2 = new Book(b1);

        b1.display();
        b2.display();
    }
}