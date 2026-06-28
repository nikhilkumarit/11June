public class Employee {
    private String name;
    private double salary;
    private String department;

    Employee(String name,double salary,String department){
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public String getDepartment(){
        return department;
    }
    public void setSalary(double salary){
        if(salary < 0){
            System.out.println("Salary is not valid.");
        }
        else{
            this.salary = salary;
        }
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
        System.out.println("Department : "+department);
    }
    public static void main(String[] args){
        Employee em1 = new Employee("Nikhil",50000,"IT");
        em1.setSalary(60000); 
    }
}
