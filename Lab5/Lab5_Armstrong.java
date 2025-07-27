import java.util.Scanner;
public class Lab5_Armstrong {

    public static void printArmstrongNumber(int start, int end) {
        for (int num = start; num <= end; num++) {
            int n = num, sum = 0;
            while (n > 0) {
                int d = n % 10;
                sum += d * d * d;
                n /= 10;
            }
            if (sum == num) {
                System.out.print(num+"  ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Starting Value: ");
        int start = sc.nextInt();
        System.out.print("Enter the Ending Value: ");
        int end = sc.nextInt();
        System.out.println("The Armstrong Numbers are: ");
        printArmstrongNumber(start, end);
    }
}

