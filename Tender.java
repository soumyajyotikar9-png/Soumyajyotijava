import java.util.Scanner;

class Tender {
    double cost;
    String companyName;

    void getData(Scanner sc) {
        System.out.print("Enter company name: ");
        companyName = sc.next();
        System.out.print("Enter tender cost: ");
        cost = sc.nextDouble();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tender[] t = new Tender[5];

      
        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
            System.out.println("\nEnter details for tender " + (i + 1) + ":");
            t[i].getData(sc);
        }
 
        double minCost = t[0].cost;
        String minCompany = t[0].companyName;

        for (int i = 1; i < 5; i++) {
            if (t[i].cost < minCost) {
                minCost = t[i].cost;
                minCompany = t[i].companyName;
            }
        }

        System.out.println("\nCompany with minimum tender cost: " + minCompany);
        System.out.println("Minimum Cost: " + minCost);

        sc.close();
    }
}