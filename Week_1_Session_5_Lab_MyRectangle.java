import java.util.Scanner;

public class Week_1_Session_5_Lab_MyRectangle {
    // Attributes
    private int length;
    private int width;

    // Constructor
    public MyRectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public int calculateArea() {
        return length * width;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Rectangle 1
        System.out.println("Enter length and width for Rectangle 1:");
        System.out.print("Length: ");
        int length1 = scanner.nextInt();
        System.out.print("Width: ");
        int width1 = scanner.nextInt();

        // Input for Rectangle 2
        System.out.println("Enter length and width for Rectangle 2:");
        System.out.print("Length: ");
        int length2 = scanner.nextInt();
        System.out.print("Width: ");
        int width2 = scanner.nextInt();

        // Create MyRectangle objects
        MyRectangle rectangle1 = new MyRectangle(length1, width1);
        MyRectangle rectangle2 = new MyRectangle(length2, width2);

        // Calculate areas
        int area1 = rectangle1.calculateArea();
        int area2 = rectangle2.calculateArea();

        // Compare areas
        if (area1 > area2) {
            System.out.println("Rectangle1 > Rectangle2");
        } else if (area1 < area2) {
            System.out.println("Rectangle1 < Rectangle2");
        } else {
            System.out.println("They are equal");
        }

        // Display areas
        System.out.println("Area of Rectangle 1: " + area1);
        System.out.println("Area of Rectangle 2: " + area2);

    }
}
