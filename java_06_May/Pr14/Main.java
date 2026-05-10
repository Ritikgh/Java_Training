
interface Discount {

    void applyDiscount(double price);
}

class FestivalDiscount implements Discount {

    public void applyDiscount(double price) {
        System.out.println("Festival Discount Price: "
                + (price - price * 0.20));
    }
}

class SeasonalDiscount implements Discount {

    public void applyDiscount(double price) {
        System.out.println("Seasonal Discount Price: "
                + (price - price * 0.10));
    }
}

class MemberDiscount implements Discount {

    public void applyDiscount(double price) {
        System.out.println("Member Discount Price: "
                + (price - price * 0.15));
    }
}

class Main {

    public static void main(String[] args) {
        Discount d = new FestivalDiscount();
        d.applyDiscount(1000);

        Discount d2 = new SeasonalDiscount();
        d2.applyDiscount(1000);

        Discount d3 = new MemberDiscount();
        d3.applyDiscount(1000);
    }
}
