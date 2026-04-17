// Write a Java program to create a class BankAccount that initializes account details using a constructor and performs deposit and withdrawal operations using the this keyword.

class BankAccount {
    String name;
    double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    void withdraw(double amount) {
        this.balance -= amount;
    }

    void display() {
        System.out.println(name + " " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount("Ritik", 1000);
        b.deposit(500);
        b.withdraw(200);
        b.display();
    }
}