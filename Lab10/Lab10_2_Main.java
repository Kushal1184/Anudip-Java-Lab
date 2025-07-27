public class Lab10_2_Main {
    public static void main(String[] args) {
        Lab10_2_BankAccount acc1 = new Lab10_2_BankAccount("Harry", Lab10_2_BankName.SBI, 12000);
        Lab10_2_BankAccount acc2 = new Lab10_2_BankAccount("John", Lab10_2_BankName.ICICI, 15000);
        Lab10_2_BankAccount acc3 = new Lab10_2_BankAccount("Alice", Lab10_2_BankName.HDFC, 10000);

        acc1.printAccountDetails();
        acc1.calculateInterest(2);

        acc2.printAccountDetails();
        acc2.calculateInterest(3);

        acc3.printAccountDetails();
        acc3.calculateInterest(1);
    }
}
