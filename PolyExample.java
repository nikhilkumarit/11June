class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    // Ye method override hoga child classes mein
    void work() {
        System.out.println(name + " kaam kar raha hai!");
    }
}

class Student extends Person {
    private String school;
    private int grade;

    Student(String name, int age, String school, int grade) {
        super(name, age);
        this.school = school;
        this.grade = grade;
    }

    @Override
    void work() {
        System.out.println(getName() + " padh raha hai!");
    }

    @Override
    void display() {
        super.display();
        System.out.println("School : " + school);
        System.out.println("Grade : " + grade);
    }
}

class Teacher extends Person {
    private String subject;
    private double salary;

    Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    void work() {
        System.out.println(getName() + " " + subject + " padha raha hai!");
    }

    @Override
    void display() {
        super.display();
        System.out.println("Subject : " + subject);
        System.out.println("Salary : " + salary);
    }
}

public class PolyExample {
    public static void main(String[] args) {

        // Normal objects
        Student s1 = new Student("Nikhil", 19, "ABC School", 11);
        Teacher t1 = new Teacher("Mr. Sharma", 35, "Maths", 60000);

        System.out.println("=== Student ===");
        s1.display();
        s1.work();

        System.out.println("\n=== Teacher ===");
        t1.display();
        t1.work();

        // Polymorphism ka magic!
        System.out.println("\n=== Polymorphism ===");
        Person p1 = new Student("Rahul", 18, "XYZ School", 10);
        Person p2 = new Teacher("Mrs. Gupta", 40, "Science", 70000);

        p1.work(); // Student ka work() chalega!
        p2.work(); // Teacher ka work() chalega!
    }
}