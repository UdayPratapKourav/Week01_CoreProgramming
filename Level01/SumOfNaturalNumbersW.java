import java.util.Scanner;

public class SumOfNaturalNumbersW {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompting user to enter a natural number
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        
        // Checking if the entered number is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
        } else {
            // Sum using formula: n * (n + 1) / 2
            int formulaSum = (n * (n + 1)) / 2;
            
            // Sum using while loop
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }
            
            // Displaying the results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);
            
            // Checking if both results match
            if (formulaSum == loopSum) {
                System.out.println("The results from both computations are correct and match.");
            } else {
                System.out.println("There is an error in the computations.");
            }
        }
        
        // Closing the scanner
        sc.close();
    }
}
