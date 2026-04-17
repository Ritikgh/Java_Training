// Write a Java program to create a class Employee that demonstrates constructor overloading and uses this() for constructor chaining to initialize different sets of data.

class Employee {
    int id;
    String name;
    double salary;

    Employee() {
        this(101, "Default", 20000);
    }

    Employee(int id, String name) {
        this(id, name, 30000);
    }

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(102, "Ritik");

        e1.display();
        e2.display();
    }
}