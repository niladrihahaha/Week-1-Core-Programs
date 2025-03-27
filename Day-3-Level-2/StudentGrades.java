

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int[] physicsMarks = new int[numberOfStudents];
        int[] chemistryMarks = new int[numberOfStudents];
        int[] mathsMarks = new int[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            System.out.print("Physics: ");
            physicsMarks[i] = scanner.nextInt();

            while (physicsMarks[i] < 0 || physicsMarks[i] > 100) {
                System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                System.out.print("Physics: ");
                physicsMarks[i] = scanner.nextInt();
            }

            System.out.print("Chemistry: ");
            chemistryMarks[i] = scanner.nextInt();

            while (chemistryMarks[i] < 0 || chemistryMarks[i] > 100) {
                System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                System.out.print("Chemistry: ");
                chemistryMarks[i] = scanner.nextInt();
            }

            System.out.print("Mathematics: ");
            mathsMarks[i] = scanner.nextInt();

            while (mathsMarks[i] < 0 || mathsMarks[i] > 100) {
                System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                System.out.print("Mathematics: ");
                mathsMarks[i] = scanner.nextInt();
            }

            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0;

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
            System.out.println("  Physics: " + physicsMarks[i]);
            System.out.println("  Chemistry: " + chemistryMarks[i]);
            System.out.println("  Mathematics: " + mathsMarks[i]);
            System.out.println("  Percentage: " + percentages[i] + "%");
            System.out.println("  Grade: " + grades[i]);
        }

        scanner.close();
    }
}

