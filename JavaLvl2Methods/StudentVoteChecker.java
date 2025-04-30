package JavaLvl2Methods;

import java.util.Scanner;

public class StudentVoteChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];

        // Get ages for 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i+1) + ": ");
            ages[i] = scanner.nextInt();

            if (canStudentVote(ages[i])) {
                System.out.println("Student " + (i+1) + " can vote.");
            } else {
                System.out.println("Student " + (i+1) + " cannot vote.");
            }
        }

        scanner.close();
    }

    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18;
    }
}

