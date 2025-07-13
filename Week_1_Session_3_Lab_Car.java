import java.util.Scanner;

public class Week_1_Session_3_Lab_Car {
    private String make;
    private String model;
    private short year;
    private int price;

    // Constructor
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println("Car Details:");
        System.out.println("Make : " + make);
        System.out.println("Model: " + model);
        System.out.println("Year : " + year);
        System.out.println("Price: Rs." + price);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for car attributes
        System.out.print("Enter car make: ");
        String make = scanner.nextLine();

        System.out.print("Enter car model: ");
        String model = scanner.nextLine();

        System.out.print("Enter car year: ");
        short year = scanner.nextShort();

        System.out.print("Enter car price: ");
        int price = scanner.nextInt();

        // Create Car object
        Car userCar = new Car(make, model, year, price);

        // Display car information
        userCar.displayInfo();

    }
}
