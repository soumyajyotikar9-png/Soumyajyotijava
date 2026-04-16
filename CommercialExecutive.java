import java.util.*;

interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {

    double saleAmount;
    String client;

    public void processSale(double amount) {
        saleAmount = amount;
        System.out.println("Sale processed: ₹" + amount);
    }

    public void generateInvoice(String clientName, double amount) {
        client = clientName;
        System.out.println("Invoice generated for " + clientName + " of ₹" + amount);
    }

    void showSummary() {
        System.out.println("\n--- Summary ---");
        System.out.println("Client: " + client);
        System.out.println("Amount: ₹" + saleAmount);
        System.out.println("Operation completed successfully.");
    }
}


class Main {
    public static void main(String[] args) {
        CommercialExecutive ce = new CommercialExecutive();

        ce.processSale(5000);
        ce.generateInvoice("ABC Pvt Ltd", 5000);
        ce.showSummary();
    }
}