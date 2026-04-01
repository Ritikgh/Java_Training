
import java.util.Scanner;

class ProblemTwenty {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String[] arr = str.split(" ");
        int count =0;

        for(String str1 : arr){
                    System.out.println("str: "+str1);

            if(str1.toLowerCase().matches("^[aeiou].*")){
                ++count;
            }
        }

        System.out.println("vowels: "+count);


       
    }
}
