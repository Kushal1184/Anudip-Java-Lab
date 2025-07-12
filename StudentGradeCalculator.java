import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Arrays to store student information
        String[] names = new String[numStudents];
        String[] addresses = new String[numStudents];
        double[][] marks = new double[numStudents][5]; // Assuming 5 subjects

        // Accepting data from user
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
            System.out.print("Address: ");
            addresses[i] = scanner.nextLine();
            System.out.println("Enter marks for 5 subjects:");

            for (int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextDouble();
            }
            scanner.nextLine(); // Consume the newline character after inputting marks
        }

        // Calculating grades and displaying output
        System.out.println("\nStudent Details and Grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Name: " + names[i]);
            System.out.println("Address: " + addresses[i]);

            double totalMarks = 0;
            for (int j = 0; j < 5; j++) {
                totalMarks += marks[i][j];
            }
            double averageMarks = totalMarks / 5.0;

            char grade;
            if (averageMarks >= 90) {
                grade = 'A';
            } else if (averageMarks >= 80) {
                grade = 'B';
            } else if (averageMarks >= 70) {
                grade = 'C';
            } else if (averageMarks >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Average Marks: " + averageMarks);
            System.out.println("Grade: " + grade);
        }
    }
}
