import java.util.Scanner;
public class Lab7_SumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers for Array input: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        double avg = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);

    }
}
