import java.util.Scanner;

class StudentVoting {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Define an array to store the ages of 10 students
        int[] ages = new int[10];

        // Take user input for the ages of 10 students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            // Check if the age is a negative number
            if (ages[i] < 0) {
                System.out.println("Invalid age.");
            } else if (ages[i] >= 18) {
                // If the student is 18 or older, they can vote
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                // If the student is under 18, they cannot vote
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }

        // Close the Scanner object
        sc.close();
    }
}
