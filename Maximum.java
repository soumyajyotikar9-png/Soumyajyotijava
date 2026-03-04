import java.util.Scanner;

class Maximum {
    int a, b, c;

    // Constructor to initialize values
    Maximum(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    // Member function to find maximum
    void findMax() {
        if (a >= b && a >= c) {
            System.out.println("Maximum number is: " + a);
        } 
        else if (b >= a && b >= c) {
            System.out.println("Maximum number is: " + b);
        } 
        else {
            System.out.println("Maximum number is: " + c);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.print("Enter third number: ");
        int z = sc.nextInt();

        // Object creation
        Maximum obj = new Maximum(x, y, z);

        // Calling member function
        obj.findMax();
    }
}
