interface DeliveryService {
    void deliverOrder();
}

class ZomatoDelivery implements DeliveryService {

    public void deliverOrder() {
        System.out.println("Order Delivered by Zomato");
    }
}

class SwiggyDelivery implements DeliveryService {

    public void deliverOrder() {
        System.out.println("Order Delivered by Swiggy");
    }
}

class Main {
    public static void main(String[] args) {
        DeliveryService d = new SwiggyDelivery();
        d.deliverOrder();

        DeliveryService d2 = new ZomatoDelivery();
        d2.deliverOrder();
    }
}