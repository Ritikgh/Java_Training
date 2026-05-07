
class Animal {

    Animal getObject() {
        System.out.println("Animal class method");
        return this;
    }
}

class Dog extends Animal {

    @Override
    Dog getObject() {
        System.out.println("Dog class method");
        return this;
    }

    void display() {
        System.out.println("This is Dog class");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.getObject().display();
    }
}
