
import java.util.Scanner;

class ProblemFour{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();


        for (char ch : str.toCharArray()) {
            

            if (str.indexOf(ch)== str.lastIndexOf(ch)) {
                System.out.println("First non repeated char = " + ch);
            }

            break;
        }


    }

}
