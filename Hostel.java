import java.util.*;

// Interface
interface Department {
    void getDeptData();
    void printDeptData();
}

// Hostel class
class Hostel {
    String hostelName, hostelLocation;
    int rooms;
    Scanner sc = new Scanner(System.in);

    void getHostelData() {
        System.out.print("Hostel Name: ");
        hostelName = sc.nextLine();
        System.out.print("Location: ");
        hostelLocation = sc.nextLine();
        System.out.print("Rooms: ");
        rooms = sc.nextInt(); sc.nextLine();
    }

    void printHostelData() {
        System.out.println(hostelName + ", " + hostelLocation + ", Rooms: " + rooms);
    }
}

// Student class
class Student extends Hostel implements Department {
    String name, regdNo, subject, deptName, deptHead;
    double marks;
    Scanner sc = new Scanner(System.in);

    void getData() {
        System.out.print("Name: "); name = sc.nextLine();
        System.out.print("Regd No: "); regdNo = sc.nextLine();
        System.out.print("Subject: "); subject = sc.nextLine();
        System.out.print("Marks: "); marks = sc.nextDouble(); sc.nextLine();
        getHostelData();
        getDeptData();
    }

    void printData() {
        System.out.println("\n" + name + " | " + regdNo + " | " + subject + " | " + marks);
        printHostelData();
        printDeptData();
    }

    public void getDeptData() {
        System.out.print("Dept Name: "); deptName = sc.nextLine();
        System.out.print("Dept Head: "); deptHead = sc.nextLine();
    }

    public void printDeptData() {
        System.out.println("Dept: " + deptName + ", Head: " + deptHead);
    }

    String getRegdNo() { return regdNo; }
}

// Driver class
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int ch;

        do {
            System.out.println("\n1.Admit  2.Migrate  3.Display  4.Exit");
            ch = sc.nextInt(); sc.nextLine();

            switch (ch) {
                case 1:
                    Student s = new Student();
                    s.getData();
                    list.add(s);
                    break;

                case 2:
                    System.out.print("Enter Regd No: ");
                    String r = sc.nextLine();
                    list.removeIf(st -> st.getRegdNo().equals(r));
                    break;

                case 3:
                    for (Student st : list) st.printData();
                    break;
            }
        } while (ch != 4);
    }
}