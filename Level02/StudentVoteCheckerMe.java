import java.util.Scanner;

public class StudentVoteCheckerMe {

    // Method to check if a student can vote based on their age
    public boolean canStudentVote(int age) {
        // Validate the age; if it's negative, return false (cannot vote)
        if (age < 0) {
            return false;
        }
        // Check if the age is 18 or above
        if (age >= 18) {
            return true;
        } else {
            return false;  // Age is less than 18
        }
    }

    public static void main(String[] args) {
        // Create an instance of StudentVoteChecker
        StudentVoteCheckerMe checker = new StudentVoteCheckerMe();

        // Create an array to store the age of 10 students
        int[] ages = new int[10];

        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Loop through the array to take input for the age of each student
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();  // Get the age from user input
        }

        // Check if each student can vote and display the result
        for (int i = 0; i < 10; i++) {
            boolean canVote = checker.canStudentVote(ages[i]);  // Check if the student can vote
            if (canVote) {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " cannot vote.");
            }
        }

        // Close the scanner
        sc.close();
    }
}
