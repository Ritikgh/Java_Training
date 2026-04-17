// Write a Java program to create a class Counter that uses a static variable and constructor to count the number of objects created.

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