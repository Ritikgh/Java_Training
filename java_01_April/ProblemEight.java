
import java.util.Scanner;

class ProblemEight {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();

        for(int i= 0; i< ch.length; i++ ){
            int count =0;
            for(char ch1: ch){
                if(ch[i] == ch1){
                    ++count;

                    System.out.println(ch[i]+" count is: "+ count);
                }
            }
        }


       
    }
}
