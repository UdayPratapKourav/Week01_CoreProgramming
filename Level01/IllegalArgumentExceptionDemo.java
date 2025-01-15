import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String input) {
        // Intentionally setting start index greater than end index
     
            System.out.println("Trying to extract substring with invalid indices...");
            String result = input.substring(5, 2);  // This will cause an exception
            System.out.println("Substring result: " + result);
        
    }

    // Method to demonstrate handling runtime exception
    public static void handleRuntimeException(String input) {
        try {
            System.out.println("Trying to extract substring with another set of invalid indices...");
            String result = input.substring(10, 1);  // This will cause an exception
            System.out.println("Substring result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for demonstration
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Calling methods to demonstrate exception generation and handling
       // generateException(userInput);
        handleRuntimeException(userInput);

        scanner.close();
    }
}
