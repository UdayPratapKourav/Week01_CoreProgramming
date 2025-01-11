import java.util.Scanner; 

// Program to calculate the number of rounds an athlete runs in a triangular park
public class TriangularParkRun {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Declare variables for the sides of the triangular park
        double side1, side2, side3;
        
        // Prompt the user to enter the lengths of the sides
        System.out.print("Enter the length of side 1 (meters): ");
        side1 = input.nextDouble();
        
        System.out.print("Enter the length of side 2 (meters): ");
        side2 = input.nextDouble();
        
        System.out.print("Enter the length of side 3 (meters): ");
        side3 = input.nextDouble();
        
        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;  // Perimeter in meters
        
        // Convert 5 km to meters (1 km = 1000 meters)
        double totalDistance = 5000.0;
        
        // Calculate the number of rounds 
        double rounds = totalDistance / perimeter;
        
        // Display the result
        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km.");
        
        // Close the Scanner
        input.close();
    }
}
