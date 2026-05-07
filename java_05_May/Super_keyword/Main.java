
class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        super.sound();
        System.out.println("Dog Sound");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sound();
    }
}
