import java.util.Scanner;

public class FactorialUsingRecursion {


        // Recursive function to calculate factorial
        public static int factorial(int number) {
            if (number == 0 || number == 1) {
                return 1;
            }
            return number * factorial(number - 1);
        }

        // Main function to handle input and output
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to find its factorial: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                int result = factorial(number);
                System.out.println("The factorial of " + number + " is: " + result);
            }
            scanner.close();
        }
    }



