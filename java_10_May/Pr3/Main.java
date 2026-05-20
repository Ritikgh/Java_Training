
import java.util.Scanner;

class ArrayIndex {

    int[] numArr = {1, 2, 3, 4, 5};

    public void getValueByIndex(int index) {
        try {
            System.out.println(numArr[index]);
        } catch (Exception e) {
            System.out.println("Error occured... " + e);
        }
    }
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index: ");
        int n1 = sc.nextInt();

        ArrayIndex obj = new ArrayIndex();

        obj.getValueByIndex(n1);

    }
}
