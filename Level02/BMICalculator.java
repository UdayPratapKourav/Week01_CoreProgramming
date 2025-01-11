import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Taking user input for weight and height
        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = sc.nextDouble();
        
        // Converting height from cm to meters
        double heightInMeters = heightInCm / 100;
        
        // Calculating BMI using the formula
        double bmi = weight / (heightInMeters * heightInMeters);
        
        // Displaying the BMI
        System.out.printf("Your BMI is: %.2f\n", bmi);
        
        // Determining weight status using BMI
        if (bmi <= 18.4) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.3 && bmi < 24.9) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi >= 25.0 && bmi < 39.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obesity");
        }
        
        // Closing the scanner
        sc.close();
    }
}
