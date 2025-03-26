import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter marks in Physics: ");
        double physics = scanner.nextDouble();
        
        System.out.print("Enter marks in Chemistry: ");
        double chemistry = scanner.nextDouble();
        
        System.out.print("Enter marks in Mathematics: ");
        double mathematics = scanner.nextDouble();
        
        // Calculate percentage
        double totalMarks = physics + chemistry + mathematics;
        double percentage = totalMarks / 3;
        
        // Determine grade
        String grade;
        String remarks;
        
        if (percentage >= 90) {
            grade = "A";
            remarks = "Excellent";
        } else if (percentage >= 80) {
            grade = "B";
            remarks = "Very Good";
        } else if (percentage >= 70) {
            grade = "C";
            remarks = "Good";
        } else if (percentage >= 60) {
            grade = "D";
            remarks = "Satisfactory";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Pass";
        } else {
            grade = "F";
            remarks = "Fail";
        }
        
        // Display results
        System.out.println("\nResults:");
        System.out.println("Physics: " + physics);
        System.out.println("Chemistry: " + chemistry);
        System.out.println("Mathematics: " + mathematics);
        System.out.println("Average Mark: " + String.format("%.2f", percentage) + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        
        scanner.close();
    }
}
