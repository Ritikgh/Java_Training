
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

       void display() {
        System.out.println("This is Dog class method");
    }
}

public class Main {

    public static void main(String[] args) {

        Animal a = new Dog();
        a.sound();

        //  Dog d = (Dog) a;
        // d.display();
    }
}
