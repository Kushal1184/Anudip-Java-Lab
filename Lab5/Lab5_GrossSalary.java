import java.util.Scanner;
public class Lab5_GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter basic salary: ");
            double basic = sc.nextDouble();

            double hra, da;
            if (basic > 15000) {
                hra = basic * 0.20;
                da = basic * 0.60;
            } else {
                hra = 3000;
                da = basic * 0.70;
            }

            double gross = basic + hra + da;
            System.out.println("Gross Salary: " + gross);

            System.out.print("Enter -1 to continue, other number to stop: ");
            if (sc.nextInt() != -1) break;
        }
    }
}

