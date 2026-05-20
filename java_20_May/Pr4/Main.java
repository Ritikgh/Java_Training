public class Main {
    public static void main(String[] args) {

        Thread t = Thread.currentThread();

        System.out.println("Current Thread Name : " + t.getName());
    }
}