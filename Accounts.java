abstract class Accounts {
    double balance;
    int accountNumber;
    String name, address;

    Accounts(int accNo, String name, String address, double balance) {
        this.accountNumber = accNo;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    abstract void withdraw(double amt);
    abstract void deposit(double amt);

    void display() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rate;

    SavingsAccount(int accNo, String name, String address, double bal, double rate) {
        super(accNo, name, address, bal);
        this.rate = rate;
    }

    void withdraw(double amt) {
        balance -= amt;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void calculateAmount() {
        balance += balance * rate / 100;
    }
}

class MainA2 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(101,"Rahul","Delhi",5000,5);
        s.deposit(1000);
        s.withdraw(500);
        s.calculateAmount();
        s.display();
    }
}