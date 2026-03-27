package lab2.task3.models;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(int accNumber, double interestRate) {
        super(accNumber);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * (interestRate / 100.0);
        this.deposit(interest);
        System.out.printf("Interest of $%.2f (%.2f%%) added to Account #%d%n",
                interest, interestRate, getAccountNumber());
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
    }

    @Override
    public String toString() {
        return String.format("SavingsAccount #%d | Balance: $%.2f | Interest Rate: %.2f%%",
                getAccountNumber(), getBalance(), interestRate);
    }

}
