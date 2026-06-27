//     String owner;
//     double balance;

//     BankAccount(String owner, double balance) {
//         this.owner = owner;
//         this.balance = balance;
//     }

//     void deposit(double amount) {
//     balance += amount;
//     System.out.println(amount + " deposited.");
// }

//     void withdraw(double amount) {
//         if (amount <= balance) {
//             balance = balance - amount;
//             System.out.println(amount + " withdraw.");
//         } else {
//             System.out.println("Balance is low.");
//         }
//     }

//     void checkbalance() {
//         System.out.println("Balance : " + balance);
//     }

//     public static void main(String[] args) {
//         BankAccount acc1 = new BankAccount("Nikhil", 50000);
//         acc1.deposit(10000);
//         acc1.withdraw(5000);
//         acc1.checkbalance();
//     }

public class BankAccount {
    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposite : " + amount);
        } else {
            System.out.println("Invalid deposite.");
        }
    }

    public void withdrew(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrew : " + amount);
        } else {
            System.out.println("Invaild withdrew.");
        }
    }
    public void display(){
        System.out.println("Account Holder : "+accountHolder);
        System.out.println("Balance : "+balance);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Nikhil", 50000);
        acc1.display();
        acc1.withdrew(5000);
        acc1.deposite(10000);
        System.out.println("Current Balance : "+acc1.getBalance());
    }
}