// Write a Java program to create a class Rectangle that uses constructor overloading to initialize dimensions for both rectangle and square and calculates the area.

class Rectangle {
    int length, breadth;

    Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    Rectangle(int side) {
        this.length = side;
        this.breadth = side;
    }

    int area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(4);

        System.out.println(r1.area());
        System.out.println(r2.area());
    }
}