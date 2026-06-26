public class BankAccount {
    String owner;
    double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(double amount) {
    balance += amount;
    System.out.println(amount + " deposited.");
}

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " withdraw.");
        } else {
            System.out.println("Balance is low.");
        }
    }

    
    void checkbalance() {
        System.out.println("Balance : " + balance);
    }
    
    
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Nikhil", 50000);
        acc1.deposit(10000);
        acc1.withdraw(5000);
        acc1.checkbalance();
    }
}