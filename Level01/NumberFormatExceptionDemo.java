import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
  
    public static void generateNumberFormatException(String input) {
        // Attempting to parse a string that may not be a number
        
            System.out.println("Trying to parse input as an integer...");
            int number = Integer.parseInt(input);  // This may throw NumberFormatException
            System.out.println("Parsed number: " + number);
       
    }

    // Method to demonstrate handling runtime exception
    public static void handleRuntimeException(String input) {
        try {
            System.out.println("Trying to parse input again as an integer...");
            int number = Integer.parseInt(input);  // This may throw NumberFormatException
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for demonstration
        System.out.print("Enter a string to parse as a number: ");
        String userInput = scanner.nextLine();

        // Calling methods to demonstrate exception generation and handling
        //generateNumberFormatException(userInput);
        handleRuntimeException(userInput);

        scanner.close();
    }
}
