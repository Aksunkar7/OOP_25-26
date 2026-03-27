package lab2.task3.models;

public class CheckingAccount extends Account{

    private static final int FREE_TRANSACTIONS = 3;  // Тегін операциялар
    private static final double TRANSACTION_FEE = 0.02; // Комиссия транзакцияга

    private int transactionCount;  // транзакциялар саны

    public CheckingAccount(int accNumber) {
        super(accNumber);
        this.transactionCount = 0;
    }

    // ақша салу, транзакция арттыру
    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        transactionCount++;
    }

    // ақша шешу, транзакция арттыру
    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionCount++;
    }


    public void deductFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            int chargeableTransactions = transactionCount - FREE_TRANSACTIONS;
            double fee = chargeableTransactions * TRANSACTION_FEE;
            // супер қолданамыз әйтпесе транзакция артып кетеді
            super.withdraw(fee);
            System.out.printf("Fee of $%.2f deducted (%d chargeable transactions) from Account #%d%n",
                    fee, chargeableTransactions, super.getAccountNumber());
        } else {
            System.out.printf("No fee charged for Account #%d (%d/%d free transactions used)%n",
                    super.getAccountNumber(), transactionCount, FREE_TRANSACTIONS);
        }
        // Reset transaction counter for the next period
        transactionCount = 0;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    @Override
    public String toString() {
        return String.format("CheckingAccount #%d | Balance: $%.2f | Transactions: %d (Free: %d)",
                super.getAccountNumber(), getBalance(), transactionCount, FREE_TRANSACTIONS);
    }
}
