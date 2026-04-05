import java.util.*;

class ProblemEleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String[] arr = str.split(" ");
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            String firstLetter = arr[i].substring(0, 1).toUpperCase();
            String restPart = arr[i].substring(1);

            result += firstLetter + restPart + " ";
        }

        System.out.println("after capitalize each word: " + result.trim());
        sc.close();

    }
}