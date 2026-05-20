
class AssignString {

    String str = null;

    public void checkStr() {

        try {

            System.out.println("Length of String: " + str.length());

        } catch (Exception e) {

            System.out.println("Error occurred... " + e);
        }
    }
}

class Main {

    public static void main(String[] args) {

        AssignString obj = new AssignString();
        obj.checkStr();
    }
}
