// Write a Java program to create a class Person that demonstrates constructor chaining using this() with multiple constructors.

class Person {
    String name;
    int age;

    Person() {
        this("Unknown", 0);
    }

    Person(String name) {
        this(name, 18);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Person p = new Person("Ritik");
        p.display();
    }
}