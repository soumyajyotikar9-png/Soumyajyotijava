import java.util.*;


interface Department {
    String deptName = "CSE";
    String deptHead = "Dr. Sharma";

    void printDeptDetails();
}


class Hostel {
    String hostelName, hostelLocation;
    int numberOfRooms;

    void getHostelData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hostel Name: ");
        hostelName = sc.nextLine();
        System.out.print("Location: ");
        hostelLocation = sc.nextLine();
        System.out.print("Number of Rooms: ");
        numberOfRooms = sc.nextInt();
    }

    void printHostelData() {
        System.out.println(hostelName + " | " + hostelLocation + " | Rooms: " + numberOfRooms);
    }
}


class Student extends Hostel implements Department {
    String studentName, regdNo, electiveSubject;
    double avgMarks;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Student Name: ");
        studentName = sc.nextLine();
        System.out.print("Regd No: ");
        regdNo = sc.nextLine();
        System.out.print("Subject: ");
        electiveSubject = sc.nextLine();
        System.out.print("Avg Marks: ");
        avgMarks = sc.nextDouble();
        getHostelData();
    }

    void printData() {
        System.out.println("\n--- Student Details ---");
        System.out.println(studentName + " | " + regdNo + " | " + electiveSubject + " | " + avgMarks);
        printHostelData();
        printDeptDetails();
    }

    public void printDeptDetails() {
        System.out.println("Dept: " + deptName + " | Head: " + deptHead);
    }
}


 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("\n1.Admit  2.Migrate  3.Display  4.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    Student s = new Student();
                    s.getData();
                    list.add(s);
                    break;

                case 2:
                    System.out.print("Enter Regd No: ");
                    String r = sc.next();
                    list.removeIf(st -> st.regdNo.equals(r));
                    break;

                case 3:
                    for (Student st : list)
                        st.printData();
                    break;

                case 4:
                    return;
            }
        }
    }
}