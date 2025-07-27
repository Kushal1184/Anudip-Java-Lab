public class Lab10_2_BankAccount {
    private String accountHolderName;
    private Lab10_2_BankName bankName;
    private double accountBalance;

    public Lab10_2_BankAccount(String accountHolderName, Lab10_2_BankName bankName, double initialBalance) {
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
            System.out.println(amount + " deposited.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println(amount + " withdrawn.");
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void printAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Bank: " + bankName);
        System.out.println("Balance: " + accountBalance);
    }

    public void calculateInterest(int numberOfYears) {
        double totalInterest = bankName.getInterestRate() * numberOfYears * accountBalance / 100;
        System.out.println("Total interest for " + numberOfYears + " years: " + totalInterest);
    }
}
