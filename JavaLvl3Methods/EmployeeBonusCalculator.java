import java.util.Random;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);
        displayResults(employeeData, bonusData);
    }

    public static int[][] generateEmployeeData(int employeeCount) {
        Random random = new Random();
        int[][] data = new int[employeeCount][2];
        for (int i = 0; i < employeeCount; i++) {
            data[i][0] = 10000 + random.nextInt(90000); // 5-digit salary
            data[i][1] = 1 + random.nextInt(10); // 1-10 years of service
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] bonusData = new double[employeeData.length][2];
        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;
            bonusData[i][0] = newSalary;
            bonusData[i][1] = bonus;
        }
        return bonusData;
    }

    public static void displayResults(int[][] employeeData, double[][] bonusData) {
        System.out.println("Employee  Old Salary  Years of Service  New Salary    Bonus");
        System.out.println("--------------------------------------------------------");
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        for (int i = 0; i < employeeData.length; i++) {
            System.out.printf("%-9d %-12d %-17d %-12.2f %-12.2f\n",
                    i+1, employeeData[i][0], employeeData[i][1], bonusData[i][0], bonusData[i][1]);
            totalOldSalary += employeeData[i][0];
            totalNewSalary += bonusData[i][0];
            totalBonus += bonusData[i][1];
        }
        System.out.println("--------------------------------------------------------");
        System.out.printf("Total     %-12.2f                %-12.2f %-12.2f\n",
                totalOldSalary, totalNewSalary, totalBonus);
    }
}

