// Write a Java program to create two objects of the same class and compare them using the == operator.

class Pr12 {

    public static void main(String[] args) {
        Pr12 obj1 = new Pr12();
        Pr12 obj2 = new Pr12();
        Pr12 obj3 = obj1;

        System.out.println("obj1 == obj2: " + (obj1 == obj2));

        System.out.println("obj1 == obj3: " + (obj1 == obj3));
    }
}
