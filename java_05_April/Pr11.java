// Write a Java program to create an array of Student objects and display the details of all students.

class Pr11 {

    String name;

    Pr11(String n) {
        name = n;
    }

    public static void main(String[] args) {
        Pr11[] students = new Pr11[3];
        students[0] = new Pr11("Anna");
        students[1] = new Pr11("Bob");
        students[2] = new Pr11("Charlie");

        for (Pr11 s : students) {
            System.out.println("Student: " + s.name);
        }
    }
}
