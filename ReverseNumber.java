import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        int originalNumber, reversedNumber = 0, remainder;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        originalNumber = scanner.nextInt();

        int tempNumber = originalNumber;

        while (tempNumber != 0) {

            remainder = tempNumber % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            tempNumber /= 10;
        }

        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);

        scanner.close();
    }
}
