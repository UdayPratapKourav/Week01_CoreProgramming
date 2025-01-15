import java.util.Scanner;

public class StudentVoting {

    // Method to generate random ages for n students
    public static int[] getAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int)(Math.random() * 90) + 10;  // Generate a random age between 10 and 99
        }
        return ages;
    }

    // Method to determine if students can vote based on their ages
    public static String[][] canVote(int[] ages) {
        String[][] voteStatus = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            // Check if age is negative or less than 18
            if (ages[i] < 0) {
                voteStatus[i][0] = String.valueOf(ages[i]);
                voteStatus[i][1] = "Cannot Vote";
            } else if (ages[i] >= 18) {
                voteStatus[i][0] = String.valueOf(ages[i]);
                voteStatus[i][1] = "Can Vote";
            } else {
                voteStatus[i][0] = String.valueOf(ages[i]);
                voteStatus[i][1] = "Cannot Vote";
            }
        }
        return voteStatus;
    }

    // Method to display the result in tabular format
    public static void displayResult(String[][] voteStatus) {
        System.out.println("Age\tCan Vote?");
        for (int i = 0; i < voteStatus.length; i++) {
            System.out.println(voteStatus[i][0] + "\t" + voteStatus[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for number of students
        System.out.print("Enter the number of students (up to 10): ");
        int n = scanner.nextInt();

        if (n > 10) {
            System.out.println("The number of students cannot exceed 10.");
            return;
        }

        // Generate random ages for the students
        int[] ages = getAges(n);

        // Determine if students can vote
        String[][] voteStatus = canVote(ages);

        // Display the result
        displayResult(voteStatus);

        scanner.close();
    }
}
