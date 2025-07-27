public class Lab6_2_Main {
    public static void main(String[] args) {
        // Using default constructor
        Lab6_2_Student s1 = new Lab6_2_Student();

        // Using constructor with name and age
        Lab6_2_Student s2 = new Lab6_2_Student("Alice", 22);

        // Using constructor with name, age, and department
        Lab6_2_Student s3 = new Lab6_2_Student("Bob", 23, "Computer Science");

        // Print details
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
    }
}
