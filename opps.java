class Student {
    String name;
    int age;
    int marks;

    void display() {
        System.out.println("Student name is " + name);
        System.out.println("Student age is : " + age);
        System.out.println("Student marks is : " + marks);
        System.out.println();
    }

    boolean isPass() {
        if (marks >= 50) {
            return true;
        }
        return false;
    }
}

public class opps {

    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Nikhil";
        s1.age = 19;
        s1.marks = 95;

        student s2 = new student();
        s2.name = "Rahul";
        s2.age = 20;
        s2.marks = 89;

        
        s1.display();
        s2.display();
        
        System.out.println(s1.name + " pass hai: " + s1.isPass());
        System.out.println(s2.name + " pass hai: " + s2.isPass());
    }
}