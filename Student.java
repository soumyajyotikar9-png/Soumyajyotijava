import java.util.Scanner;
interface Exam {
    void percent_cal();
} 
class Student {
    String name;
    int roll_no;
    float marks1, marks2;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Roll No: ");
        roll_no = sc.nextInt();
        System.out.println("Enter Marks1 : ");
        marks1 = sc.nextFloat();
        System.out.println("Enter Marks2 : ");
        marks2 = sc.nextFloat();
    }
    void show(){
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: "+ name);
        System.out.println("Roll No: "+roll_no);
        System.out.println("Marks1: "+marks1);
        System.out.println("Marks2: "+marks2);
    }
}
class Result extends Student implements Exam{
    float per;
    public void percent_cal(){
        per = (marks1 + marks2) / 2;
    }
    void display(){
        System.out.println("Percentage: "+per + "%");
    }
}
class Main{
    public static void main(String[] args){
        Result r = new Result();
        r.getData();
        r.show();
        r.percent_cal();
        r.display();
    }
}