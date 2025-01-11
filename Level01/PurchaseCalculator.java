import java.util.Scanner;  

// Program to calculate the total price of an item
public class PurchaseCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Declare variables for unit price and quantity
        double unitPrice;
        int quantity;
        
        
        System.out.print("Enter the unit price (INR): ");
        unitPrice = input.nextDouble();  
        
        
        System.out.print("Enter the quantity: ");
        quantity = input.nextInt();  
        
        // Calculate the total price
        double totalPrice = unitPrice * quantity;
        
        // Display the result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
        
        // Close the Scanner
        input.close();
    }
}
