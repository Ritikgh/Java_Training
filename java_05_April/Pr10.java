// Write a Java program to create a Student class and return the object from a method, then display the returned object details.

class Pr10 {
    String name;

    Pr10(String n) { name = n; }

    static Pr10 createStudent(String n) {
        return new Pr10(n);
    }

    public static void main(String[] args) {
        Pr10 s = createStudent("James");
        System.out.println("Created Student: " + s.name);
    }
}