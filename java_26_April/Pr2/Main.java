class Shape {
    void area() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s;

        s = new Circle(5);
        s.area();   // Runtime polymorphism

        s = new Rectangle(4, 6);
        s.area();   // Runtime polymorphism
    }
}