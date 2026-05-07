class Notification {

    void send() {
        System.out.println("Sending notification");
    }
}

class Email extends Notification {

    @Override
    void send() {
        System.out.println("Sending Email Notification");
    }
}

class SMS extends Notification {

    @Override
    void send() {
        System.out.println("Sending SMS Notification");
    }
}

class Push extends Notification {

    @Override
    void send() {
        System.out.println("Sending Push Notification");
    }
}

public class Main {

    public static void main(String[] args) {

        Notification n;

        // Email notification
        n = new Email();
        n.send();

        // SMS notification
        n = new SMS();
        n.send();

        // Push notification
        n = new Push();
        n.send();
    }
}