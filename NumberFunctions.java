import java.util.Scanner;

public class NumberFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arithmetic
        System.out.println("Enter two numbers for arithmetic operations: ");
        System.out.print("First Number: ");
        int a = sc.nextInt();
        System.out.print("Second Number: ");
        int b = sc.nextInt();
        arithmeticOperations(a, b);

        // Reverse and Palindrome
        System.out.print("\nEnter a number to reverse and check palindrome: ");
        int num = sc.nextInt();
        int reversed = reverseNumber(num);
        System.out.println("Reversed Number: " + reversed);
        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome.");
        } else {
            System.out.println(num + " is not a Palindrome.");
        }

        // Swap
        System.out.print("\nEnter two numbers to swap: ");
        System.out.print("First Number: ");
        int x = sc.nextInt();
        System.out.print("Second Number: ");
        int y = sc.nextInt();
        swapNumbers(x, y);

    }

    // 1. Arithmetic Operations
    static void arithmeticOperations(int a, int b) {
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division: Cannot divide by zero");
        }
    }

    // 2. Reverse a Number
    static int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    // 3. Check if the number is a Palindrome
    static boolean isPalindrome(int num) {
        return num == reverseNumber(num);
    }

    // 4. Swap Two Numbers
    static void swapNumbers(int a, int b) {
        System.out.println("Before swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
