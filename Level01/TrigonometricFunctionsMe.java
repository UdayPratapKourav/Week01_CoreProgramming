import java.util.Scanner;

public class TrigonometricFunctionsMe {

    // Method to calculate sine, cosine, and tangent of an angle
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return an array containing sine, cosine, and tangent values
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner for user input

        // Take user input for the angle in degrees
        System.out.println("Enter the angle in degrees:");
        double angle = sc.nextDouble();

        // Create an object of TrigonometricFunctions to call the non-static method
        TrigonometricFunctionsMe trigFunctions = new TrigonometricFunctionsMe();

        // Call the method to calculate the trigonometric functions
        double[] results = trigFunctions.calculateTrigonometricFunctions(angle);

        // Output the results
        System.out.println("Sine of  "+angle+"  degrees: "+ results[0]);
        System.out.println("Cosine of  "+angle+"  degrees: "+ results[1]);
        System.out.println("Tangent of  "+angle+"  degrees: "+ results[2]);

        sc.close();  
    }
}
