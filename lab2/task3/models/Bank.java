package lab2.task3.models;

import java.util.Vector;

public class Bank {

    private Vector<Account> accounts;
    private int nextAccountNumber = 1001; // Бастапқы мән

    public Bank() {
        accounts = new Vector<>();
    }

    public Account openAccount() {
        Account acc = new Account(nextAccountNumber++); // бірдей стиль
        accounts.add(acc);
        System.out.println("Opened: " + acc);
        return acc;
    }

    public SavingsAccount openSavingsAccount(double interestRate) {
        SavingsAccount acc = new SavingsAccount(nextAccountNumber++, interestRate);
        accounts.add(acc);
        System.out.println("Opened: " + acc);
        return acc;
    }

    public CheckingAccount openCheckingAccount() {
        CheckingAccount acc = new CheckingAccount(nextAccountNumber++);
        accounts.add(acc);
        System.out.println("Opened: " + acc);
        return acc;
    }

    public boolean closeAccount(int accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                accounts.remove(acc);
                System.out.printf("Closed Account #%d (Final balance: $%.2f)%n",
                        acc.getAccountNumber(), acc.getBalance());
                return true;
            }
        }
        System.out.println("Account #" + accountNumber + " not found.");
        return false;
    }

    public void update() {
        System.out.println("\n--- Performing Period Update ---");
        for (Account acc : accounts){
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).addInterest();
            }else if(acc instanceof CheckingAccount) {
                ((CheckingAccount) acc).deductFee();
            }
        }
        System.out.println("--- Update Complete ---\n");
    }

    public void printAllAccounts() {
        System.out.println("\n===== Bank Accounts =====");
        if (accounts.isEmpty()) {
            System.out.println("  No accounts on file.");
        } else {
            for (Account acc : accounts) {
                acc.print();
            }
        }
        System.out.println("=========================\n");
    }

    public int getAccountCount() {
        return accounts.size();
    }
}