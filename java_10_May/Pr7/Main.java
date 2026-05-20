public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Inside catch block: " + ex);
        } finally {
            System.out.println("Inside finally block");
        }
    }
}
