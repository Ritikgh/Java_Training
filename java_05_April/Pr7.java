// Write a Java program to create a BankAccount class with methods for deposit, withdraw, and balance display, then perform banking operations using an object.

class Pr7 {

    double balance = 100000.0;

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        balance -= amt;
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Pr7 account = new Pr7();
        account.deposit(500);
        account.withdraw(200);
        account.checkBalance();
    }
}
