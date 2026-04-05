
import java.util.Scanner;

class ProblemOne {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int lowerCase = 0;
        int uperCase = 0;
        int digits = 0;
        int speChar = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                ++lowerCase;
            }
            if (Character.isUpperCase(ch)) {
                ++uperCase;
            }
            if (Character.isDigit(ch)) {
                ++digits;
            }
            if (Character.isSpaceChar(ch)) {
                ++speChar;
            }

        }

        System.out.println("Total lower case = " + lowerCase);
        System.out.println("Total upper case = " + uperCase);
        System.out.println("Total digits = " + digits);
        System.out.println("Total special char = " + speChar);

    }

}
