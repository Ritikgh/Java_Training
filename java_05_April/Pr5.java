// Write a Java program to create a Mobile class and create three different objects of the class, then display their details.

class Pr5 {
    String brand;
    double price;

    Pr5(String b, double p) {
        brand = b;
        price = p;
    }

    void show() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }

    public static void main(String[] args) {
        Pr5 m1 = new Pr5("iPhone", 999);
        Pr5 m2 = new Pr5("Samsung", 899);
        Pr5 m3 = new Pr5("Pixel", 699);
        
        m1.show(); m2.show(); m3.show();
    }
}