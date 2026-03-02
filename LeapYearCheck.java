import java.util.Scanner;

class LeapYearCheck {

    int year;

    LeapYearCheck(int y) {
        year = y;
    }

    void checkLeapYear() {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int y = sc.nextInt();

        LeapYearCheck obj = new LeapYearCheck(y);
        obj.checkLeapYear();

        sc.close();
    }
}