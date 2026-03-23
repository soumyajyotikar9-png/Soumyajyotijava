class Student {
    int id;
    String name;
    int age;

    Student() {
        id = 100;
        name = "Soumya";
        age = 20;
    }

    Student(int i, String n) {
        id = i;
        name = n;
        age = 18;
    }

    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name + " Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();                
        Student s2 = new Student(101, "Rahul");    
        Student s3 = new Student(102, "Aman", 20); 

        s1.display();
        s2.display();
        s3.display();
    }
}