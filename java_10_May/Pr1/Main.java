
import java.util.Scanner;

class DivisionByZero {

    int num1;
    int num2;

    public DivisionByZero(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    public void division() {
        try {
            int result = num1 / num2;
            System.out.println("Result : " + result);
        } catch (Exception e) {
            System.out.println("Error occured... "+e);
        }
    }

}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();

        DivisionByZero obj = new DivisionByZero(n1, n2);

        obj.division();

    }
}
