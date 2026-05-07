
class Payment {

    void pay() {
        System.out.println("Payment method");
    }
}

class UPI extends Payment {

    @Override
    void pay() {
        System.out.println("Payment done using UPI");
    }
}

class CreditCard extends Payment {

    @Override
    void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

class DebitCard extends Payment {

    @Override
    void pay() {
        System.out.println("Payment done using Debit Card");
    }
}

public class Main {

    public static void main(String[] args) {

        Payment p;

        p = new UPI();
        p.pay();

        p = new CreditCard();
        p.pay();

        p = new DebitCard();
        p.pay();
    }
}
