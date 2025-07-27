public class Lab10_1_BankAccount {
    private String accountHolderName;
    private String bankName;
    private double accountBalance;

    public Lab10_1_BankAccount(String accountHolderName, String bankName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println(amount + " deposited. New balance: " + accountBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + accountBalance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName + ", Bank: " + bankName + ", Balance: " + accountBalance);
    }
}
