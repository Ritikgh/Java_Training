class StringToInt {

    public static void main(String[] args) {

        String str = "sdsd";

        try {

            int num = Integer.parseInt(str);

            System.out.println("Number = " + num);

        } catch (NumberFormatException e) {

            System.out.println("Error Occurred... " + e);

        } finally {

            System.out.println("Program executed successfully.");
        }
    }
}