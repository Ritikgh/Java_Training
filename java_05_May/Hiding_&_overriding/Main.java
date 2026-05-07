class Animal {

    static void show() {
        System.out.println("Static method in Animal");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    static void show() {
        System.out.println("Static method in Dog");
    }

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {

    public static void main(String[] args) {

        Animal a = new Dog();

        // Method Hiding
        a.show();

        // Method Overriding
        a.sound();
    }
}