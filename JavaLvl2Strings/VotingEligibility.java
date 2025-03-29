import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();

        int[] ages = generateRandomAges(n);
        String[][] votingStatus = getVotingStatus(ages);

        displayVotingStatus(votingStatus);
    }

    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 100); // Random age between 0 and 99
        }
        return ages;
    }

    public static String[][] getVotingStatus(int[] ages) {
        String[][] status = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            status[i][0] = String.valueOf(ages[i]);
            status[i][1] = ages[i] >= 18 ? "Yes" : "No";
        }
        return status;
    }

    public static void displayVotingStatus(String[][] status) {
        System.out.println("Age\tCan Vote");
        for (String[] row : status) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
