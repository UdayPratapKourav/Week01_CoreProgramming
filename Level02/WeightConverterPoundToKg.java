import java.util.Scanner;  

// Program to convert weight from pounds to kilograms
public class WeightConverterPoundToKg {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Declare a variable for weight in pounds
        double weightInPounds;
        
        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        weightInPounds = input.nextDouble();
        
        // Convert pounds to kilograms (1 pound = 2.2 kg)
        double weightInKg = weightInPounds / 2.2;
        
        // Display the result
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kilograms is " + weightInKg);
        
        // Close the Scanner
        input.close();
    }
}
