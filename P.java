class Person {
    public String name;
    public int age;
    
    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
    
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age is not vaild.");
        } else {
            this.age = age;
        }
    }
}

    class Employee extends Person {
        double salary;

        Employee(String name, int age, double salary) {
            super(name, age);
            this.salary = salary;
        }

        void display() {
            super.display();
            System.out.println("Salary : " + salary);
        }
    }

    class P {
        public static void main(String[] args) {
            Employee em1 = new Employee("Nikhil", 19, 70000);
            em1.display();

        }
    }