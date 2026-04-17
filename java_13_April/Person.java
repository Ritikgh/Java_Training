// 8. Write a Java program to demonstrate **constructor chaining** using this() in a class Person with multiple constructors.

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
        Person p1 = new Person();
        Person p2 = new Person("Ritik");
        Person p3 = new Person("Ritik", 25);

        p1.display();
        p2.display();
        p3.display();
    }
}