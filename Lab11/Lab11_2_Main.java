import java.util.Scanner;
public class Lab11_2_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an animal:");
            System.out.println("1. Dog");
            System.out.println("2. Cat");
            System.out.println("3. Animal");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            Lab11_2_Animal animal;

            switch (choice) {
                case 1:
                    animal = new Lab11_2_Dog();
                    break;
                case 2:
                    animal = new Lab11_2_Cat();
                    break;
                case 3:
                    animal = new Lab11_2_Animal();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
                    continue;
            }

            animal.makeSound();
        }
    }
}
