// Write a Java program to demonstrate the use of the this keyword to call a method of the current class.

class Test {
    void show() {
        System.out.println("Show method");
    }

    void display() {
        this.show();
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}