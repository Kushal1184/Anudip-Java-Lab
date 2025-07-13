import java.util.Scanner;

public class Week_2_Session_1_Lab_StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        System.out.println("Enter marks for 5 subjects (each out of 100):");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();

            total += marks[i];
        }

        double average = total / 5.0;
        String grade;

        // Grade assignment using conditions
        if (average > 90) {
            grade = "Ex";
        } else if (average > 80) {
            grade = "A";
        } else if (average > 60) {
            grade = "B";
        } else if (average >= 40) {
            grade = "C";
        } else {
            grade = "F";
        }

        // Output results
        System.out.println("\nTotal Marks: " + total + " / 500");
        System.out.printf("Average: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

    }
}
