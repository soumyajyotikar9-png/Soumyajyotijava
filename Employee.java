// Gross Interface
interface Gross {
    double calcGross();
}

// Employee class
class Employee {
    String name;
    double basic;

    Employee(String n, double b) {
        name = n;
        basic = b;
    }
}

// Salary class (inherits + implements)
class Salary extends Employee implements Gross {
    Salary(String n, double b) {
        super(n, b);
    }

    public double calcGross() {
        return basic + (0.2 * basic); // 20% allowance
    }

    void show() {
        System.out.println(name + " Gross Salary: " + calcGross());
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        Salary s = new Salary("Amit", 10000);
        s.show();
    }
}