class Newperson {
    String name;

    void greet() {
        System.out.println("Hello, mera naam " + name + " hai!");
    }
}

class Student extends Newperson {
    String grade;

    void study() {
        System.out.println(name + " padh raha hai.");
        System.out.println(name + " garde " + grade);
    }
}

class realclass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nikhil";
        s1.grade = "A";
        s1.greet();
        s1.study();
    }
}
