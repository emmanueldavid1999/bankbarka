package UI;

public class savings_account {
    private double balance;
    private double maxWithdrawal;

    public savings_account(double initialBalance, double maxWithdrawal) {
        this.balance = initialBalance;
        this.maxWithdrawal = maxWithdrawal;
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount <= maxWithdrawal) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else if (amount > maxWithdrawal) {
            System.out.println("Withdrawal amount exceeds maximum withdrawal limit.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Current balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxWithdrawal() {
        return maxWithdrawal;
    }

    public static void main(String[] args) {
        savings_account account = new savings_account(100000, 10000);
        System.out.println("Initial balance: " + account.getBalance());

        // Example withdrawals
        account.withdraw(5000);  // Valid withdrawal
        account.withdraw(15000); // Exceeds maximum withdrawal limit
        account.withdraw(100000); // Exceeds available balance

        // Example deposit
        account.deposit(5000); // Valid deposit
        account.deposit(100000); // Valid deposit, no limit

        System.out.println("Final balance: " + account.getBalance());
    }
}
