// 7. Write a Java program to create a class Counter that uses a **static variable** to count the number of objects created using a constructor.

class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();

        System.out.println("Objects created: " + count);
    }
}