import java.util.*;

class ComputeDetail {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take the number of students as input
        System.out.println("Enter the number of students:");
        int number = sc.nextInt();

        // Step 2: Create arrays to store marks, percentages, grades, and remarks for each student
        int[][] marks = new int[number][3]; // 2D array for storing marks of 3 subjects (Physics, Chemistry, Maths)
        double[] percentages = new double[number]; // Array to store percentages of students
        char[] grades = new char[number]; // Array to store grades of students
        String[] remarks = new String[number]; // Array to store remarks based on grades

        // Step 3: Input marks for each student
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the marks of student " + (i + 1) + ":");

            // Take input for marks in 3 subjects, ensure marks are positive
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print("Enter marks for subject " + (j + 1) + ": ");
                    marks[i][j] = sc.nextInt();
                    if (marks[i][j] < 0) {
                        System.out.println("Marks cannot be negative. Please enter positive values.");
                    }
                } while (marks[i][j] < 0); // Continue asking if marks are negative
            }

            // Step 4: Calculate the total marks and percentage for each student
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2]; // Sum of marks in all subjects
            percentages[i] = totalMarks / 3; // Calculate percentage (average of marks)

            // Step 5: Determine the grade and remarks based on the percentage
            if (percentages[i] >= 80.0) {
                grades[i] = 'A'; // Grade A for percentage >= 80
                remarks[i] = "Level 4, above agency-normalized standards"; // Remark for grade A
            } else if (percentages[i] >= 70.0 && percentages[i] < 80.0) {
                grades[i] = 'B'; // Grade B for percentage between 70 and 79
                remarks[i] = "Level 3, at agency-normalized standards"; // Remark for grade B
            } else if (percentages[i] >= 60.0 && percentages[i] < 70.0) {
                grades[i] = 'C'; // Grade C for percentage between 60 and 69
                remarks[i] = "Level 2, below but approaching agency-normalized standards"; // Remark for grade C
            } else if (percentages[i] >= 50.0 && percentages[i] < 60.0) {
                grades[i] = 'D'; // Grade D for percentage between 50 and 59
                remarks[i] = "Level 1, too below agency-normalized standards"; // Remark for grade D
            } else if (percentages[i] >= 40.0 && percentages[i] < 50.0) {
                grades[i] = 'E'; // Grade E for percentage between 40 and 49
                remarks[i] = "Level 1, too below agency-normalized standards"; // Remark for grade E
            } else {
                grades[i] = 'R'; // Grade R for percentage below 40
                remarks[i] = "Remedial standards"; // Remark for grade R
            }
        }

        // Step 6: Display the details (marks, percentages, grades, remarks) for each student
        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1) + " details are:");
            // Display marks for each subject
            for (int j = 0; j < 3; j++) {
                System.out.println("Marks in subject " + (j + 1) + ": " + marks[i][j]);
            }
            // Display percentage, grade, and remarks
            System.out.println("Percentage: " + percentages[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println("Remark: " + remarks[i]);
        }

        sc.close();
    }
}
