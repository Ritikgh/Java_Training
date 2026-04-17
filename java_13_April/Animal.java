// 9. Write a Java program to demonstrate the use of **constructors in inheritance** with a base class Animal and a derived class Dog.

class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog constructor called");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
    }
}