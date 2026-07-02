class Person {
    public String name;
    public int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age is not vaild.");
        } else {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Nikhil", 19);

        p1.setName("Rahul");
        p1.setAge(21);
        System.out.println("Name is : " + p1.getName());
        System.out.println("Age is : " + p1.getAge());
    }
}