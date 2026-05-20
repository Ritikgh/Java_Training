
class MultipleCatchDemo {

    public static void main(String[] args) {

        try {

            int a = 10 / 0;

            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);

            String str = null;
            System.out.println(str.length());

        } catch (ArithmeticException e) {

            System.out.println("ArithmeticException Occured");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("ArrayIndexOutOfBoundsException Occured");

        } catch (NullPointerException e) {

            System.out.println("NullPointerException Occured");

        } catch (Exception e) {

            System.out.println("Other Exception Occured");
        }

        System.out.println("Program executed successfully.");
    }
}
