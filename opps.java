class Student {
    String name;
    int age;
    int marks;

    Student(String name, int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

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

        Student s1 = new Student("Nikhil", 19, 98);
        Student s2 = new Student("Aman", 21, 87);
        s1.display();
        s2.display();
        
        System.out.println(s1.name + " pass hai: " + s1.isPass());
        System.out.println(s2.name + " pass hai: " + s2.isPass());
    }
}