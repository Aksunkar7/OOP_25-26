package lab2.task3.app;

import lab2.task3.models.Account;
import lab2.task3.models.Bank;
import lab2.task3.models.CheckingAccount;
import lab2.task3.models.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        System.out.println("===== Opening Accounts =====\n");

        Account basic = bank.openAccount();
        SavingsAccount sav1 = bank.openSavingsAccount(5.0);   // 5% interest
        SavingsAccount sav2 = bank.openSavingsAccount(3.25);  // 3.25% interest
        CheckingAccount chk1 = bank.openCheckingAccount();
        CheckingAccount chk2 = bank.openCheckingAccount();

        basic.deposit(500.00);
        sav1.deposit(1000.00);
        sav2.deposit(2000.00);
        chk1.deposit(800.00);
        chk2.deposit(300.00);


        // SavingsAccount transactions
        sav1.deposit(200.00);
        sav1.withdraw(150.00);

        chk1.deposit(100.00);
        chk1.withdraw(50.00);
        chk1.deposit(25.00); // 3 операциядан асты
        chk1.withdraw(10.00);


        chk2.deposit(50.00);
        chk2.withdraw(20.00); // 2 транзакция ғана, комиссия ұстамайды

        // Басқа счетка аудару
        System.out.println("\n--- Transfer: basic -> sav2 ($100) ---");
        basic.transfer(100.00, sav2);

        System.out.println("\n===== Account Status Before Update =====");
        bank.printAllAccounts();

        // проценттер мен комиссиялар орындау
        bank.update();

        System.out.println("===== Account Status After Update =====");
        bank.printAllAccounts();

        // аккаунт жабу
        System.out.println("===== Closing an Account =====\n");
        bank.closeAccount(chk2.getAccountNumber());

        System.out.println("\n===== Final Account Status =====");
        bank.printAllAccounts();
    }
}
