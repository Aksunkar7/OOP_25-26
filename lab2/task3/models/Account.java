package lab2.task3.models;

public class Account {
    private double balance; // The current balance
    private int accNumber; // The account number

    public Account(int a){
        this.balance = 0.0;
        this.accNumber = a;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            this.balance += sum;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double sum) {
        if (sum < 0) {
            System.out.println("Sum must be positive");
        } else if( sum > this.balance) {
            System.out.println("Not enough balance");
        } else {
            this.balance -= sum;
        }
    }
    public double getBalance() {
        return this.balance;
    }
    public int getAccountNumber() {
        return this.accNumber;
    }
    public void transfer(double amount, Account other) {
        if (amount < 0) {
            System.out.println("Transfer amount must be positive");

        } else if (amount > this.balance) {
            System.out.println("Not enough balance");
        } else {
            other.deposit(amount);
            this.withdraw(amount);
        }
    }
    @Override
    public String toString() {
        return String.format("Balance: %s\nAccount number: %s", this.balance, this.accNumber);
    }
    public final void print() {
        // Do not override this method, override the toString method
        System.out.println(toString());
    }
}
