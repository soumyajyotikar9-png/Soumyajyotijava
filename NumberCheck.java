import java.util.Scanner;

class NumberCheck {
    int num;

    // Constructor
    NumberCheck(int n) {
        num = n;
    }

    // Member function
    void checkNumber() {
        if (num > 0) {
            System.out.println("The number is Positive.");
        } 
        else if (num < 0) {
            System.out.println("The number is Negative.");
        } 
        else {
            System.out.println("The number is Zero.");
        }
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        NumberCheck obj = new NumberCheck(number);
        obj.checkNumber();

        sc.close();
    }
}
