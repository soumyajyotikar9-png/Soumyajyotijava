import java.util.Scanner;

class Item {
    int code;
    double price;

    void getData(Scanner sc) {
        System.out.print("Enter item code: ");
        code = sc.nextInt();
        System.out.print("Enter item price: ");
        price = sc.nextDouble();
    }

    void putData() {
        System.out.println(code + "\t" + price);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item[] items = new Item[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            items[i] = new Item();
            System.out.println("\nEnter details for item " + (i + 1) + ":");
            items[i].getData(sc);
        }
        System.out.println("\nCode\tPrice");
        System.out.println("----------------");

        for (int i = 0; i < 5; i++) {
            items[i].putData();
            total += items[i].price;
        }

        System.out.println("----------------");
        System.out.println("Total Price = " + total);

        sc.close();
    }
}
