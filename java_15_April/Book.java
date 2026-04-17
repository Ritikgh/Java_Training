// Write a Java program to create a class Book and implement a copy constructor to copy values from one object to another and display both objects.

class Book {
    String title;
    int price;

    Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    Book(Book b) {
        this.title = b.title;
        this.price = b.price;
    }

    void display() {
        System.out.println(title + " " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java", 500);
        Book b2 = new Book(b1);

        b1.display();
        b2.display();
    }
}