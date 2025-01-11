import java.util.Scanner;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Declare variables for fee and discount percentage
        double fee;
        double discountPercent;

        // Prompt the user to enter the total fee
        System.out.print("Enter the total fee: ");
        fee = input.nextDouble(); 

        
        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble(); 

        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculate the final fee after applying the discount
        double finalFee = fee - discount;

        // Display the discount amount and the final discounted fee
        System.out.println("The discount amount is INR " + discount);
        System.out.println("The final discounted fee is INR " + finalFee);

        // Close the Scanner to release resources
        input.close();
    }
}
