
abstract class Employee {

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {

    int salary;

    FullTimeEmployee(int salary) {
        this.salary = salary;
    }

    void calculateSalary() {
        System.out.println("Full Time Salary: " + salary);
    }
}

class PartTimeEmployee extends Employee {

    int hours, rate;

    PartTimeEmployee(int hours, int rate) {
        this.hours = hours;
        this.rate = rate;
    }

    void calculateSalary() {
        System.out.println("Part Time Salary: "
                + (hours * rate));
    }
}

class Main {

    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(50000);
        e1.calculateSalary();

        Employee e2 = new PartTimeEmployee(5, 500);
        e2.calculateSalary();
    }
}
