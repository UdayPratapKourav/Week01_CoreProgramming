import java.util.Scanner;

public class ChocolateDistributionMe {

    // Method to calculate the number of chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        // Calculate chocolates each child gets and the remaining chocolates
        int quotient = numberOfChocolates / numberOfChildren;  
        int remainder = numberOfChocolates % numberOfChildren; 
        return new int[]{quotient, remainder};  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner for user input

        // Get the number of chocolates and number of children
        System.out.println("Enter the number of chocolates:");
        int numberOfChocolates = sc.nextInt();

        System.out.println("Enter the number of children:");
        int numberOfChildren = sc.nextInt();

        // Call the method to get the quotient and remainder
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Print the results
        System.out.println("Each child will get " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);

        sc.close();  // Close the scanner
    }
}
