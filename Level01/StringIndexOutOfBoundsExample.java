import java.util.*;

class StringIndexOutOfBoundsExample {

    // Method to generate a StringIndexOutOfBoundsException
    public static char generateException(String str) {
        // Accessing an invalid index (length + 1) to deliberately throw an exception
        return str.charAt(str.length() + 1);
    }

    // Method to demonstrate handling of StringIndexOutOfBoundsException
    public static char demonstrateException(String str) {
        try {
            // Attempting to access an invalid index
            return str.charAt(str.length() + 1);
        } catch (StringIndexOutOfBoundsException e) {
            // Handling the exception and printing a message
            System.out.println("Exception handled: " + e);
        }
        // Returning a valid character if an exception occurs
        return str.charAt(0);  // Changed to return the first character as a fallback
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner to take user input
        System.out.println("Enter a string:");
        String str = sc.next();  // Reading a string from user

        // Demonstrating exception generation and handling
        System.out.println("\nHandling exception using demonstrateException method:");
        char result = demonstrateException(str);  // Call method that handles exception
        System.out.println("Character returned after handling: " + result);

        // Optional: Uncomment to directly trigger and observe unhandled exception
        /*
        System.out.println("\nGenerating exception without handling:");
        try {
            char generated = generateException(str);  // Deliberately causes an exception
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception in main: " + e);
        }
        */

        sc.close();  // Closing the scanner
    }
}
