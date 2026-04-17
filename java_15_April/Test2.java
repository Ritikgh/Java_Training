// Write a Java program to demonstrate the use of the this keyword to pass the current object as an argument to another method.

class Test2 {
    void show(Test2 t) {
        System.out.println("Method called");
    }

    void display() {
        this.show(this);
    }

    public static void main(String[] args) {
        new Test2().display();
    }
}