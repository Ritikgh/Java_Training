// Write a Java program to create an Employee class with data members id, name, and salary, then create two objects and display their details.

class Pr2 {

    int id = 125868;
    String name = "Rohit";
    int salary = 5000000;

    void printEmployee() {

        System.out.println("Id: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    public static void main(String args[]) {
        Pr2 emp1 = new Pr2();
        emp1.printEmployee();
        Pr2 emp2 = new Pr2();
        emp2.printEmployee();
    }
}
