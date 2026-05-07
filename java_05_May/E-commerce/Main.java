class Product {

    double price;

    Product(double price) {
        this.price = price;
    }

    double calculateDiscount() {
        return 0;
    }
}

class Electronics extends Product {

    Electronics(double price) {
        super(price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.10;
    }
}

class Clothing extends Product {

    Clothing(double price) {
        super(price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.20;
    }
}

class Grocery extends Product {

    Grocery(double price) {
        super(price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.05;
    }
}

public class Main {

    public static void main(String[] args) {

        Product p;

        p = new Electronics(50000);
        System.out.println("Electronics Discount: " + p.calculateDiscount());

        p = new Clothing(3000);
        System.out.println("Clothing Discount: " + p.calculateDiscount());

        p = new Grocery(2000);
        System.out.println("Grocery Discount: " + p.calculateDiscount());
    }
}