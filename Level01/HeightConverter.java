import java.util.Scanner;  

public class HeightConverter {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Declare a variable to store height in centimeters
        double heightCm;
        
        
        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();  
        
        // Conversion factors
        double inchConversion = heightCm / 2.54;  
        double feet = (inchConversion / 12.0);   
        double inches = inchConversion % 12;      
        
        // Display the results
        System.out.println("Your height in cm is " + heightCm + " cm.");
        System.out.println("Your height in feet is " + feet + " feet and " + inches + " inches.");
        
       
        input.close();
    }
}
