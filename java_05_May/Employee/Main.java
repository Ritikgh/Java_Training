
class Employee {

    void getSalary() {
        System.out.println("Employee salary is 500000");
    }

}

class Manager extends Employee {

    @Override
    void getSalary() {
        System.out.println("Manager salary is 5000");
    }
}

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getSalary();

        Manager manager = new Manager();
        manager.getSalary();
    }
}
