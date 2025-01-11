import java.util.Scanner;  // Importing Scanner class for user input

// Program to calculate Simple Interest
public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Declare variables for principal, rate, and time
        double principal, rate, time;
        
        // Prompt the user to enter values for principal, rate, and time
        System.out.print("Enter the Principal amount (INR): ");
        principal = input.nextDouble();
        
        System.out.print("Enter the Rate of interest (%): ");
        rate = input.nextDouble();
        
        System.out.print("Enter the Time period (years): ");
        time = input.nextDouble();
        
        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;
        
        // Display the result
        System.out.println("The Simple Interest is INR " + simpleInterest + " for Principal INR " + principal + ", Rate of Interest " + rate + "%, and Time " + time + " years.");
        
       
        input.close();
    }
}
