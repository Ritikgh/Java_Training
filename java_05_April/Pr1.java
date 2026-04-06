// Write a Java program to create a Student class with data members name, roll number, and marks, then create an object and display the student details.

class Pr1 {

    String name = "Rohit";
    int rollNum = 12;
    int standard = 10;

    void printStudent() {

        System.out.println("Name: " + name + ", Roll number: " + rollNum + ", Standard: " + standard);
    }

    public static void main(String args[]) {
        Pr1 student = new Pr1();
        student.printStudent();
    }
}
