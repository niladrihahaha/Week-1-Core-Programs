import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();

        int[][] scores = generateRandomScores(n);
        double[][] stats = calculateStats(scores);
        String[][] grades = calculateGrades(stats);

        displayScorecard(scores, stats, grades);
    }

    public static int[][] generateRandomScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 100); // Random score between 0 and 99
            }
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][4];
        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100;

            stats[i][0] = total;
            stats[i][1] = average;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places
            stats[i][3] = i; // Student index
        }
        return stats;
    }

    public static String[][] calculateGrades(double[][] stats) {
        String[][] grades = new String[stats.length][1];
        for (int i = 0; i < stats.length; i++) {
            if (stats[i][2] >= 90) {
                grades[i][0] = "A";
            } else if (stats[i][2] >= 80) {
                grades[i][0] = "B";
            } else if (stats[i][2] >= 70) {
                grades[i][0] = "C";
            } else if (stats[i][2] >= 60) {
                grades[i][0] = "D";
            } else {
                grades[i][0] = "F";
            }
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] stats, String[][] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] +
                    "\t" + stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "\t" + grades[i][0]);
        }
    }
}

