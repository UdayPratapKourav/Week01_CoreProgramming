import java.util.Scanner;

public class QuotientAndRemainderMe {

  
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        
        int quotient = number / divisor;  
        int remainder = number % divisor; 
        return new int[]{quotient, remainder};  // Return the result as an array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        // Take user input for number and divisor
        System.out.println("Enter the number:");
        int number = sc.nextInt();

        System.out.println("Enter the divisor:");
        int divisor = sc.nextInt();

        // Call the method to get the quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Print the results
        System.out.println("The quotient is: " + result[0]);
        System.out.println("The remainder is: " + result[1]);

        sc.close();  // Close the scanner
    }
}
