abstract class Shape {
    abstract void area();
    abstract void perimeter();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Circle Area: " +
                (3.141 * radius * radius));
    }

    void perimeter() {
        System.out.println("Circle Perimeter: " +
                (2 * 3.141 * radius));
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println("Rectangle Area: " +
                (length * breadth));
    }

    void perimeter() {
        System.out.println("Rectangle Perimeter: " +
                (2 * (length + breadth)));
    }
}

class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        s1.area();
        s1.perimeter();

        Shape s2 = new Rectangle(10, 5);
        s2.area();
        s2.perimeter();
    }
}