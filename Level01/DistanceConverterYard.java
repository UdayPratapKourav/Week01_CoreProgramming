import java.util.Scanner;  

// Program to convert distance from feet to yards and miles
public class DistanceConverterYard {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Declare variable to store distance in feet
        double distanceInFeet;
        
        
        System.out.print("Enter the distance in feet: ");
        distanceInFeet = input.nextDouble();  // Read user input
        
        // Conversion factors
        double distanceInYards = distanceInFeet / 3;  // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760;  // 1 mile = 1760 yards

        // Display the results
        System.out.println("The distance of " + distanceInFeet + " feet is equivalent to " + distanceInYards + " yards and " + distanceInMiles + " miles.");
        
        // Close the Scanner
        input.close();
    }
}
