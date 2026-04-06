// Write a Java program to create a Product class with product name, quantity, and price, then calculate and display the total bill.

class Pr8 {
    String name;
    int qty;
    double price;

    Pr8(String n, int q, double p) {
        name = n; qty = q; price = p;
    }

    void displayBill() {
        System.out.println("Product: " + name +", Quantity: " + qty +", Price per product: " +price+", Total Bill: " + (qty * price));
    }

    public static void main(String[] args) {
        Pr8 p = new Pr8("Keyboard", 3, 25.0);
        p.displayBill();
    }
}