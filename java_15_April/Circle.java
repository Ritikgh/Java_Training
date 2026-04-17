// Write a Java program to create a class Circle where the constructor initializes the radius and methods use the this keyword to calculate area and circumference.

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * this.radius * this.radius;
    }

    double circumference() {
        return 2 * Math.PI * this.radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println(c.area());
        System.out.println(c.circumference());
    }
}