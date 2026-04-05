
import java.util.Scanner;

class ProblemNineTen {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();


        System.out.println("alphabets: "+str.matches("[a-zA-Z]+"));


       
    }
}
