// Write a Java program to demonstrate returning the current object from a method using the this keyword.

class Test3 {
    Test3 get() {
        return this;
    }

    void display() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        new Test3().get().display();
    }
}