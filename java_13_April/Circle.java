// 6. Write a Java program to create a class Circle where the constructor initializes the radius and methods calculate **area and circumference**.

class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        System.out.println("Area: " + (Math.PI * radius * radius));
    }

    void circumference() {
        System.out.println("Circumference: " + (2 * Math.PI * radius));
    }

    public static void main(String[] args) {
        Circle c = new Circle(7);
        c.area();
        c.circumference();
    }
}