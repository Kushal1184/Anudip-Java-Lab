import java.util.Scanner;

public class Lab5_CountOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter start of range (-1 to exit): ");
            int start = sc.nextInt();
            if (start == -1) break;

            System.out.print("Enter end of range: ");
            int end = sc.nextInt();

            int evenCount = 0, oddCount = 0;

            System.out.print("Even numbers: ");
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    evenCount++;
                }
            }
            System.out.println("\nTotal Even Numbers: " + evenCount);

            System.out.print("Odd numbers: ");
            for (int i = start; i <= end; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                    oddCount++;
                }
            }
            System.out.println("\nTotal Odd Numbers: " + oddCount);
            System.out.println();
        }
    }
}
