import java.util.Scanner;

public class NaturalNumberSumMe {

    
    public int sumOfNaturalNumbers(int n) {
        int sum = 0;  // Initialize sum to 0
        // Loop to calculate sum of natural numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i;  // Add each number to sum
        }
        return sum;  // Return the sum
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object for user input
        
        System.out.println("Enter a number (n):");
        int n = sc.nextInt();  // Read the input number n

        // Create an object of NaturalNumberSum to call the non-static method
        NaturalNumberSumMe numberSum = new NaturalNumberSumMe();
        
        // Calculate and print the sum
        int result = numberSum.sumOfNaturalNumbers(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + result);

        sc.close();  
    }
}
