// Write a Java program to create a Book class and initialize its data members using a method, then display the book information.

class Pr4 {

    String engine;
    String model;
    String brand;

    void addCarDetails(String e, String m, String b) {

        engine = e;
        model = m;
        brand = b;
    }

    void printCar() {

        System.out.println("Engine: " + engine + ", Model: " + model + ", Brand: " + brand);
    }

    public static void main(String args[]) {
        Pr4 car = new Pr4();
        car.addCarDetails("V6", "M3", "BMW");
        car.printCar();
    }
}
