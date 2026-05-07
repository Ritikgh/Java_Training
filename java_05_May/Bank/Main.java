class Bank {
    double interestRate() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    double interestRate() {
        return 6.5;
    }
}

class ICICI extends Bank {
    @Override
    double interestRate() {
        return 7.0;
    }
}

class HDFC extends Bank {
    @Override
    double interestRate() {
        return 6.8;
    }
}

public class Main {
    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        System.out.println("SBI Interest Rate: " + b.interestRate() + "%");

        b = new ICICI();
        System.out.println("ICICI Interest Rate: " + b.interestRate() + "%");

        b = new HDFC();
        System.out.println("HDFC Interest Rate: " + b.interestRate() + "%");
    }
}