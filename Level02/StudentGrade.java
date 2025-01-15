import java.util.Random;

public class StudentGrade {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] getScores(int n) {
        int[][] scores = new int[n][3]; // 3 columns for Physics, Chemistry, Math
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(100);  // Physics
            scores[i][1] = rand.nextInt(100);  // Chemistry
            scores[i][2] = rand.nextInt(100);  // Math
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4]; // Columns for Total, Average, Percentage, and Rounded Percentage
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
            results[i][3] = Math.round(percentage * 100.0) / 100.0; // Rounding percentage to 2 decimal places
        }
        return results;
    }

    // Method to calculate grade based on percentage
    public static String[][] calculateGrades(double[][] results) {
        String[][] grades = new String[results.length][2]; // Columns for Percentage and Grade
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][3];
            String grade;
            
            if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else if (percentage >= 50) {
                grade = "D";
            } else if (percentage >= 40) {
                grade = "E";
            } else {
                grade = "R";
            }

            grades[i][0] = String.valueOf(percentage);
            grades[i][1] = grade;
        }
        return grades;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScoreCard(int[][] scores, double[][] results, String[][] grades) {
        System.out.println("Student | Physics | Chemistry | Math | Total | Average | Percentage | Grade");
        System.out.println("-------------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.print(" | " + scores[i][j]);
            }
            System.out.print(" | " + results[i][0] + " | " + results[i][1] + " | " + results[i][3] + " | " + grades[i][1]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;  // Number of students (you can change this)
        
        // Generate random scores
        int[][] scores = getScores(n);

        // Calculate results (total, average, percentage)
        double[][] results = calculateResults(scores);

        // Calculate grades based on percentage
        String[][] grades = calculateGrades(results);

        // Display the scorecard
        displayScoreCard(scores, results, grades);
    }
}
