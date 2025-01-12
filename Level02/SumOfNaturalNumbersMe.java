import java.util.*;

class SumOfNaturalNumbersMe {
    
    // Recursive method to calculate the sum of n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) {  // Base case: if n is 1, the sum is 1
            return 1;
        } else {
            return n + sumRecursive(n - 1);  // Recursive case: sum(n) = n + sum(n-1)
        }
    }
    
    // Method to calculate the sum of n natural numbers using the formula
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;  // Formula for sum of first n natural numbers
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Take input from the user
        System.out.println("Enter a natural number:");
        int n = sc.nextInt();
        
        // Check if the number is a valid natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            System.exit(0);  // Exit the program if input is not a natural number
        }
        
        // Calculate the sum using recursion
        int sumRecursiveResult = sumRecursive(n);
        
        // Calculate the sum using the formula
        int sumFormulaResult = sumFormula(n);
        
        // Print both results
        System.out.println("Sum using recursion: " + sumRecursiveResult);
        System.out.println("Sum using formula: " + sumFormulaResult);
        
        // Compare the two results
        if (sumRecursiveResult == sumFormulaResult) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("There is an error in the computation.");
        }
        
        sc.close();  // Close the scanner
    }
}
