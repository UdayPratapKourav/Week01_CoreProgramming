import java.util.*;

class ReverseAString {

    // Method to reverse the input string
    public static String reverseString(String str) {
        String result = ""; // Initialize an empty string to store the reversed string
        
        // Loop through the string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i); // Append each character to the result
        }

        return result; // Return the reversed string
    }

    // Main method to take input and display the reversed string
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.println("Enter the String :");
        
        // Take input and apply trim to remove any leading or trailing spaces
        String str = sc.nextLine().trim();
        
        // Call the reverseString method and store the result
        String result = reverseString(str);
        
        // Output the reversed string
        System.out.println("The reversed String is: " + result);
        
        sc.close(); // Close the scanner resource
    }
}
