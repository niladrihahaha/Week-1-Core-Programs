public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            System.out.print("Enter salary: ");
            salaries[i] = scanner.nextDouble();

            while (salaries[i] <= 0) {
                System.out.println("Invalid salary. Please enter a positive value.");
                System.out.print("Enter salary: ");
                salaries[i] = scanner.nextDouble();
            }

            System.out.print("Enter years of service: ");
            yearsOfService[i] = scanner.nextDouble();

            while (yearsOfService[i] < 0) {
                System.out.println("Invalid years of service. Please enter a non-negative value.");
                System.out.print("Enter years of service: ");
                yearsOfService[i] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }

            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\nEmployee Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("  Old Salary: $" + salaries[i]);
            System.out.println("  Bonus: $" + bonuses[i]);
            System.out.println("  New Salary: $" + newSalaries[i]);
        }

        System.out.println("\nSummary:");
        System.out.println("Total Bonus Payout: $" + totalBonus);
        System.out.println("Total Old Salary: $" + totalOldSalary);
        System.out.println("Total New Salary: $" + totalNewSalary);

        scanner.close();
    }
}

