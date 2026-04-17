// Write a Java program to create a class Student with attributes name, rollNo, and marks, initialize them using a parameterized constructor with the help of the this keyword, and display the details by creating multiple objects.

class Student {
    String name;
    int rollNo;
    double marks;

    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display() {
        System.out.println(name + " " + rollNo + " " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ritik", 1, 85);
        Student s2 = new Student("Aman", 2, 90);

        s1.display();
        s2.display();
    }
}