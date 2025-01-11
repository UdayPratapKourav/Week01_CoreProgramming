import java.util.Scanner; 

public class TriangleAreaCalculator {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        // Declare variables for base and height in inches
        double base, height;
        
        
        System.out.print("Enter the base of the triangle in inches: ");
        base = input.nextDouble();  
        
        
        System.out.print("Enter the height of the triangle in inches: ");
        height = input.nextDouble();  

        // Calculate the area of the triangle in square inches
        double areaInInches = 0.5 * base * height;

        // Convert the area to square centimeters (1 inch = 2.54 cm)
        double areaInCm = areaInInches * 6.4516;  // 1 square inch = 6.4516 square centimeters

        // Display the results
        System.out.println("The area of the triangle is " + areaInInches + " square inches.");
        System.out.println("The area of the triangle is " + areaInCm + " square centimeters.");
        
        // Close the Scanner
        input.close();
    }
}
