import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(5000); 

        System.out.println("Welcome to Simple Banking Application");
        System.out.println("Current Balance: ₹" + account.getBalance());

        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();

        try {
            account.withdraw(withdrawAmount);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Final Balance: ₹" + account.getBalance());
        scanner.close();
    }
}
