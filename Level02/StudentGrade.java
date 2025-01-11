import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Taking input for marks of three subjects
        System.out.print("Enter marks for Physics: ");
        double physicsMarks = sc.nextDouble();
        
        System.out.print("Enter marks for Chemistry: ");
        double chemistryMarks = sc.nextDouble();
        
        System.out.print("Enter marks for Maths: ");
        double mathsMarks = sc.nextDouble();
        
        // Calculating total marks and percentage
        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double percentage = (totalMarks / 300) * 100;
        
        // Determining the grade and remarks based on percentage
        String grade = "";
        String remarks = "";
        
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4,  above agency- normalized standards";
        } else if (percentage >= 70 && percentage <=79) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60 && percentage<=69) {
            grade = "C";
            remarks = "Level 2, below, but approaching egency-normalized standards";
        } else if (percentage >= 50 && percentage<=59) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40 && percentage<=49) {
            grade = "E";
            remarks = "Level 1, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }
        
        // Displaying the result
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + totalMarks + "/300");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        
        // Closing the scanner to prevent resource leaks
        sc.close();
    }
}
