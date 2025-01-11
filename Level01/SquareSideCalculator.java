import java.util.Scanner; 

// Program to find the side length of a square from its perimeter
public class SquareSideCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Declare a variable to store the perimeter
        double perimeter;
        
       
        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();  
        
        // Calculate the side of the square
        double side = perimeter / 4;

        // Display the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        
        // Close the Scanner
        input.close();
    }
}
