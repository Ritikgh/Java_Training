
import java.util.Scanner;

class ProblemThree {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            if (result.indexOf(String.valueOf(currChar)) == -1) {
                result.append(currChar);
            }
        }

        System.out.println("After removed duplicate = " + result.toString());

    }

}
