
import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int[][] marks = new int[numberOfStudents][3]; // [physics, chemistry, maths]
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            System.out.print("Physics: ");
            marks[i][0] = scanner.nextInt();

            while (marks[i][0] < 0 || marks[i][0] > 100) {
                System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                System.out.print("Physics: ");
                marks[i][0] = scanner.nextInt();
            }

            System.out.print("Chemistry: ");
            marks[i][1] = scanner.nextInt();

            while (marks[i][1] < 0 || marks[i][1] > 100) {
                System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                System.out.print("Chemistry: ");
                marks[i][1] = scanner.nextInt();
            }

            System.out.print("Mathematics: ");
            marks[i][2] = scanner.nextInt();

            while (marks[i][2] < 0 || marks[i][2] > 100) {
                System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                System.out.print("Mathematics: ");
                marks[i][2] = scanner.nextInt();
            }

            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 80) {
                grades[i] = 'B';
            } else if (percentages[i] >= 70) {
                grades[i] = 'C';
            } else if (percentages[i] >= 60) {
                grades[i] = 'D';
            } else if (percentages[i] >= 50) {
                grades[i] = 'E';
            } else {
                grades[i] = 'F';
            }
        }

        System.out.println("\nStudent Results:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("  Physics: " + marks[i][0]);
            System.out.println("  Chemistry: " + marks[i][1]);
            System.out.println("  Mathematics: " + marks[i][2]);
            System.out.println("  Percentage: " + percentages[i] + "%");
            System.out.println("  Grade: " + grades[i]);
        }

        scanner.close();
    }
}

