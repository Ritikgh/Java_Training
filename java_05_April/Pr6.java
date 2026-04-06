// Write a Java program to create a Rectangle class and calculate the area and perimeter of the rectangle using an object.

class Pr6 {

    double length, width;

    void setDimensions(double l, double w) {
        length = l;
        width = w;
    }

    void calculate() {
        System.out.println("Area: " + (length * width));
        System.out.println("Perimeter: " + (2 * (length + width)));
    }

    public static void main(String[] args) {
        Pr6 r = new Pr6();
        r.setDimensions(10, 5);
        r.calculate();
    }
}
