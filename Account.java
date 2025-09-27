package lab6;

public class Account {



    private int accnt_no;
    private String name;
    private double balance;

    public Account(int accnt_no, String name, double balance) {
        this.accnt_no = accnt_no;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new ArithmeticException(" amount cannot be zero or negative");
        }
        balance += amount; 
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws Insufficientbalanceexception {
        if (amount <= 0) {
            throw new ArithmeticException("Withdrawal amount cannot be negative or zero");
        }
        if (amount > balance) {
            throw new Insufficientbalanceexception("Insufficient balance for withdraw.");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public void showBalance() {
        System.out.println("Account No: " + accnt_no + ", Name: " + name + ", Balance: " + balance);
    }
}