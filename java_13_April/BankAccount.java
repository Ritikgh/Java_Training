// 10. Write a Java program to create a class BankAccount with account details initialized through a constructor and methods for **deposit and withdrawal**, then display the final balance.

class BankAccount {
    String name;
    double balance;

    BankAccount(String n, double b) {
        name = n;
        balance = b;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println(name + " Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ritik", 1000);

        acc.deposit(500);
        acc.withdraw(300);

        acc.display();
    }
}