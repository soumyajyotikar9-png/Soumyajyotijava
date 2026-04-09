interface Bank {
    void deposit(double a);
    void withdraw(double a);
}

class Customer {
    String name;
    Customer(String n) { name = n; }
}

class Account extends Customer implements Bank {
    double bal;

    Account(String n, double b) {
        super(n);
        bal = b;
    }

    public void deposit(double a) { bal += a; }
    public void withdraw(double a) { bal -= a; }

    void show() {
        System.out.println(name + " Balance: " + bal);
    }
}

class Main {
    public static void main(String[] args) {
        Account a = new Account("Rahul", 5000);
        a.deposit(1000);
        a.withdraw(500);
        a.show();
    }
}
