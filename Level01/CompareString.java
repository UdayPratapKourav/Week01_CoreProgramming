import java.util.*;  

// Class to demonstrate string comparison using two different methods
class CompareString {

    // Method to compare two strings character by character without using built-in methods
    public static boolean compareString(String s1, String s2) {

        // Check if lengths are different, return false if they are not equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Loop through each character in the strings
        for (int i = 0; i < s1.length(); i++) {
            // Compare characters at each index; if any character differs, return false
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        // If all characters match, return true
        return true;
    }

    // Method to compare two strings using the built-in equals() method
    public static boolean compareString2(String s1, String s2) {
        return s1.equals(s2);  // Returns true if the content of both strings is the same
    }

    // Main method to take user input and demonstrate string comparison
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object for user input

        // Prompt the user to input two strings
        System.out.print("Enter the first string: ");
        String str1 = sc.next();  // Read the first string

        System.out.print("Enter the second string: ");
        String str2 = sc.next();  // Read the second string

        // Compare strings using the first method and display the result
        System.out.println("Are strings the same (compareString method): " + compareString(str1, str2));

        // Compare strings using the second method and display the result
        System.out.println("Are strings the same (compareString2 method): " + compareString2(str1, str2));

        sc.close();  // Close the Scanner object to prevent resource leaks
    }
}
