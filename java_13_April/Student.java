// 1. Write a Java program to create a class Student with data members name and age. Initialize them using a **default constructor** and display the values.

class Student {
    String name;
    int age;

    Student() {
        name = "Ritik";
        age = 22;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}