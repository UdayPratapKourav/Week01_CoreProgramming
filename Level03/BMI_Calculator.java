import java.util.Scanner;

public class BMI_Calculator {

    // Method to calculate BMI and status based on weight (kg) and height (cm)
    public static String[] calculateBMI(double weight, double height) {
        // Convert height from cm to meters
        double heightInMeters = height / 100;
        
        // Calculate BMI
        double bmi = weight / (heightInMeters * heightInMeters);
        
        // Determine the BMI status
        String status = "";
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25 && bmi < 39.9) {
            status = "Overweight";
        } else {
            status = "Obese	";
        }
        
        // Return BMI and status in a string array
        return new String[] {String.format("%.2f", bmi), status};
    }

    // Method to process all 10 team members' data, calculate BMI and status
    public static String[][] processBMI(double[][] data) {
        String[][] bmiData = new String[10][4];  // 10 persons, 4 columns: Height, Weight, BMI, Status
        
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];   // Weight in kg
            double height = data[i][1];   // Height in cm
            
            // Calculate BMI and status for each person
            String[] result = calculateBMI(weight, height);
            
            // Store data: Height, Weight, BMI, Status
            bmiData[i][0] = String.valueOf(height);  // Height in cm
            bmiData[i][1] = String.valueOf(weight);  // Weight in kg
            bmiData[i][2] = result[0];  // BMI
            bmiData[i][3] = result[1];  // Status
        }
        
        return bmiData;
    }

    // Method to display the BMI results in a tabular format
    public static void displayBMI(String[][] bmiData) {
        System.out.println("Person | Height (cm) | Weight (kg) | BMI     | Status");
        System.out.println("--------------------------------------------------------");
        
        for (int i = 0; i < bmiData.length; i++) {
            System.out.println("Person " + (i + 1) + " | " + bmiData[i][0] + "        | " + bmiData[i][1] + "        | " + bmiData[i][2] + " | " + bmiData[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2]; // 10 persons, 2 columns: Weight and Height

        // Taking input for 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) and height (cm) for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = scanner.nextDouble();
        }

        // Process the BMI data
        String[][] bmiData = processBMI(data);

        // Display the result
        displayBMI(bmiData);

        scanner.close();
    }
}
