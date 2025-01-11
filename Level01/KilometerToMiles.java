import java.util.*;

class KilometerToMiles {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Declare a variable to store the distance in kilometers
        double km;

        // Read the input for kilometers from the user
        System.out.print("Enter the distance in kilometers: ");
        km = input.nextDouble();

        // Convert the distance from kilometers to miles using the formula
        // 1 mile = 1.6 kilometers
        double miles = km / 1.6;

        // Print the result, displaying the equivalent distance in miles
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km.");

        // Close the Scanner object to free up resources
        input.close();
    }
}
