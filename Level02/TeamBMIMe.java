import java.util.Scanner;

public class TeamBMIMe {

    // Method to calculate BMI for each person
    public static double calculateBMI(double weight, double heightInCm) {
        double heightInMeters = heightInCm / 100; // Convert height from cm to meters
        return weight / (heightInMeters * heightInMeters); // BMI = weight / (height^2)
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.0) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25.0 && bmi < 39.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array to store weight (kg), height (cm), and BMI for each person
        double[][] teamData = new double[10][3]; // 10 members, 3 columns (weight, height, BMI)

        // Get input for each person and calculate BMI
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            // Input weight and height
            System.out.print("Enter weight (kg): ");
            double weight = scanner.nextDouble();

            System.out.print("Enter height (cm): ");
            double height = scanner.nextDouble();

            // Calculate BMI and store it in the array
            double bmi = calculateBMI(weight, height);
            teamData[i][0] = weight;   // First column: weight
            teamData[i][1] = height;   // Second column: height
            teamData[i][2] = bmi;      // Third column: BMI
        }

        // Display BMI, height, weight, and status for each person
        System.out.println("\nBMI Details and Status of Each Person:");
        System.out.println("------------------------------------------------");
        System.out.println("Weight (kg)\tHeight (cm)\tBMI\t\tStatus");

        for (int i = 0; i < 10; i++) {
            double weight = teamData[i][0];
            double height = teamData[i][1];
            double bmi = teamData[i][2];
            String status = getBMIStatus(bmi);

            // Print the details of each person
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s\n", weight, height, bmi, status);
        }

        scanner.close();
    }
}
