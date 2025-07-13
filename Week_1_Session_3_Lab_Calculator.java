public class Week_1_Session_3_Lab_Calculator {

    // Method 1: Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adds three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Adds two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Main method to test overloaded add() methods
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Declare and initialize variables
        int a = 5;
        int b = 10;
        int c = 15;
        double d1 = 4.5;
        double d2 = 7.3;

        // Testing different add() methods
        int sum1 = calc.add(a, b);        // Two integers
        int sum2 = calc.add(a, b, c);     // Three integers
        double sum3 = calc.add(d1, d2);   // Two doubles

        // Output the results
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of three integers: " + sum2);
        System.out.println("Sum of two doubles: " + sum3);
    }
}
