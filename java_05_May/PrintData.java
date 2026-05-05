class PrintData {
   public int print(int data) {
        System.out.println("Integer data: " + data);
        return data;
       
    }

    public double print(double data) {
        System.out.println("Double data: " + data);
        return data;
    }

    public String print(String data) {
        System.out.println("String data: " + data);
        return data;
    }

    public static void main(String[] args) {
        PrintData printData = new PrintData();

        printData.print(42);
        printData.print(3.14);
        printData.print("Hello, World!");
    }
}