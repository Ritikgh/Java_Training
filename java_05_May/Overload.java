
class Overload {

    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(String s) {
        System.out.println("String: " + s);
    }

    void display(double d) {
        System.out.println("Double: " + d);
    }

    void display(double a, int b) {
        System.out.println("Double + Integer: " + (a + b));
    }

    void display(double a, double b) {
        System.out.println("Double + Double: " + (a + b));
    }

    void display(double a, double b, double c) {
        System.out.println("Double + Double + Double: " + (a + b + c));
    }

    void display(int a, int b) {
        System.out.println("Integer + Integer: " + (a + b));
    }

    void display(int a, String b) {
        System.out.println("Integer + String: " + (a + " " + b));
    }

    void display(String a, String b) {
        System.out.println("String + String: " + (a + " " + b));
    }

    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.display(10);
        obj.display("Hello");
        obj.display(3.14);
        obj.display(3.14, 10);
        obj.display(3.14, 3.14);
        obj.display(3.14, 3.14, 3.14);
        obj.display(10, 20);
        obj.display(10, "World");
        obj.display("Hello", "World");
    }
}
