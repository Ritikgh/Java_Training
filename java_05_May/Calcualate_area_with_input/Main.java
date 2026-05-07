
import java.util.Scanner;

class Shape {

    void calculateArea() {
        System.out.println("Area calculation");
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = 3.141 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {

    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {

    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Shape s;

        // Circle input
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        s = new Circle(r);
        s.calculateArea();

        // Rectangle input
        System.out.print("\nEnter length of rectangle: ");
        double l = sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double w = sc.nextDouble();

        s = new Rectangle(l, w);
        s.calculateArea();

        // Triangle input
        System.out.print("\nEnter base of triangle: ");
        double b = sc.nextDouble();

        System.out.print("Enter height of triangle: ");
        double h = sc.nextDouble();

        s = new Triangle(b, h);
        s.calculateArea();

        sc.close();
    }
}
