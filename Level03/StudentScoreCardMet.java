import java.util.*;

public class StudentScoreCardMet {

    // Method to generate random 2-digit scores for PCM for students
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Math
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = random.nextInt(50) + 51; // Random score between 51 and 100
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // Total, Average, Percentage
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t", i + 1);
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d\t", scores[i][j]);
            }
            System.out.printf("%.0f\t%.2f\t%.2f\n", results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);

        displayScoreCard(scores, results);
    }
}
