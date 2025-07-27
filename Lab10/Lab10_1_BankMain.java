public class Lab10_1_BankMain {
    public static void main(String[] args) {


        Lab10_1_BankAccount acc1 = new Lab10_1_BankAccount("Alice", "ICICI", 5000);
        Lab10_1_BankAccount acc2 = new Lab10_1_BankAccount("Bob", "HDFC", 10000);
        Lab10_1_BankAccount acc3 = new Lab10_1_BankAccount("Charlie", "SBI", 2000);


        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.displayAccountDetails();

        acc2.deposit(500);
        acc2.withdraw(2000);
        acc2.displayAccountDetails();

        acc3.deposit(1000);
        acc3.withdraw(500);
        acc3.displayAccountDetails();
    }
}
