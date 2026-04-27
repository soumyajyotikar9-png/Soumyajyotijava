abstract class Asset {
    abstract void displayDetails();
}

class Stock extends Asset {
    void displayDetails() {
        System.out.println("Stock Details");
    }
}

class Bond extends Asset {
    void displayDetails() {
        System.out.println("Bond Details");
    }
}

class Savings extends Asset {
    void displayDetails() {
        System.out.println("Savings Details");
    }
}

class MainA5 {
    public static void main(String[] args) {
        Asset a;

        a = new Stock();
        a.displayDetails();

        a = new Bond();
        a.displayDetails();

        a = new Savings();
        a.displayDetails();
    }
}