interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("UPI Payment: " + amount);
    }
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Credit Card Payment: " + amount);
    }
}

class NetBanking implements Payment {
    public void pay(double amount) {
        System.out.println("Net Banking Payment: " + amount);
    }
}

class Main {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay(5000);

        Payment p2 = new CreditCard();
        p2.pay(5000);

        Payment p3 = new NetBanking();
        p3.pay(5000);
    }
}