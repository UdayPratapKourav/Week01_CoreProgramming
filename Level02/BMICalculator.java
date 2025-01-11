import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        // Arrays to store the weight, height, BMI, and weight status of the persons
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Taking input for weight and height of each person
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();

            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status based on BMI
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        System.out.println("\nHeight(m)  Weight(kg) BMI  Weight Status");
        
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f   %.2f   %.2f  %s%n", height[i], weight[i], bmi[i], status[i]);
        }

        // Close the scanner
        sc.close();
    }
}
