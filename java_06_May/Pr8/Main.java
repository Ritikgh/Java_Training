
abstract class Notification {

    abstract void sendNotification();
}

class EmailNotification extends Notification {

    void sendNotification() {
        System.out.println("Email Notification Sent");
    }
}

class SMSNotification extends Notification {

    void sendNotification() {
        System.out.println("SMS Notification Sent");
    }
}

class Main {

    public static void main(String[] args) {
        Notification n1 = new EmailNotification();
        n1.sendNotification();

        Notification n2 = new SMSNotification();
        n2.sendNotification();
    }
}
