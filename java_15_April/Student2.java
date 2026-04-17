// Write a Java program to create a class Student where a method accepts an object as a parameter and the current object is passed using the this keyword.

class Student2 {
    String name;

    Student2(String name) {
        this.name = name;
    }

    void display(Student2 s) {
        System.out.println(s.name);
    }

    void call() {
        display(this);
    }

    public static void main(String[] args) {
        Student2 s = new Student2("Ritik");
        s.call();
    }
}