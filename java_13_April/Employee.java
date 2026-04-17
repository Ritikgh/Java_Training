// 2. Write a Java program to create a class Employee with id, name, and salary. Use a **parameterized constructor** to initialize and display the details.

class Employee {
    int id;
    String name;
    double salary;

    Employee(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee(101, "Ritik", 50000);
        e.display();
    }
}