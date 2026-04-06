// Write a Java program to create a Box class and pass the object to a method to calculate its area.

class Pr9 {
    double length, width;

    Pr9(double l, double w) { length = l; width = w; }

    static void calculateArea(Pr9 b) {
        System.out.println("Area: " + (b.length * b.width));
    }

    public static void main(String[] args) {
        Pr9 myBox = new Pr9(10, 20);
        calculateArea(myBox);
    }
}