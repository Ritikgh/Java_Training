
import java.util.Scanner;

class ProblemSeventen {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();


        System.out.println("digits: "+str.matches("\\d+"));


       
    }
}
