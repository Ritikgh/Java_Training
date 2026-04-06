// Write a Java program to create a Book class and initialize its data members using a method, then display the book information.

class Pr3 {

    String name;
    String author;

    void addBookDetails(String n, String a) {

        name = n;
        author = a;
    }

    void printBook() {

        System.out.println("Book name: " + name + ", Author: " + author);
    }

    public static void main(String args[]) {
        Pr3 Book = new Pr3();
        Book.addBookDetails("abcd","xyz");
        Book.printBook();
    }
}
