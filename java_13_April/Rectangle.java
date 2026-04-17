// 4. Write a Java program to demonstrate **constructor overloading** in a class Rectangle with two constructors: * One to initialize length and breadth * Another to initialize only one value (for square)

class Rectangle {
    int length, breadth;


    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

  
    Rectangle(int side) {
        length = breadth = side;
    }

    void area() {
        System.out.println("Area: " + (length * breadth));
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(4);

        r1.area();
        r2.area();
    }
}