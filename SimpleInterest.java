import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal and time
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter time in years: ");
        double time = scanner.nextDouble();

        double rate;

        // Determine interest rate based on principal
        if (principal > 10000) {
            rate = 10.0;
        } else if (principal >= 5000 && principal <= 10000) {
            rate = 8.0;
        } else {
            rate = 5.0;
        }

        // Calculate simple interest
        double interest = (principal * rate * time) / 100;

        //Total Amount to Pay
        double total=principal+interest;

        // Output the result
        System.out.println("Interest Rate: " + rate + "%");
        System.out.println("Simple Interest: " + interest);
        System.out.println("Total Amount to Pay: "+total);
    }
}
