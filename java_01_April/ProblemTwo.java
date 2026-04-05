
import java.util.Scanner;

class ProblemTwo {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Before trim= " + str);

        System.out.println("After trim= " + str.trim());

    }

}
