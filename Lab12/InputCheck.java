import java.util.Scanner;

public class InputCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        try {
            System.out.print("Enter an integer: ");
            number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
