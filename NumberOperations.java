import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        NumberOperations obj = new NumberOperations();  // Creating object
        obj.getInput();  // Calling instance method using object
    }


    public  void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        add(num1,num2);
        swap(num1,num2);
        findGreater(num1,num2);
    }

    // Function to add two numbers and display result
    public  void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    // Function to swap two numbers and display result
    public  void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping: a = " + num1 + ", b = " + num2);
    }

    // Function to find and display greater number
    public  void findGreater(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

}
