import java.util.Scanner;

class CreateSubString {

    // Method to create a substring using 
    public static String subStringUsingCharAt(String str, int start, int end) {
        String result = ""; // Using a simple string for concatenation
        for (int i = start; i < end; i++) {
            result += str.charAt(i); // Append each character using charAt
        }
        return result;
    }

    // Method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2); // Compare strings using equals()
    }

    // Method to create a substring using the substring() method
    public static String subStringUsingSubstring(String str, int start, int end) {
        return str.substring(start, end); // Using the built-in substring() method
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for string and indices
        System.out.print("Enter the string: ");
        String str = sc.next();

        System.out.print("Enter the start index: ");
        int start = sc.nextInt();

        System.out.print("Enter the end index: ");
        int end = sc.nextInt();

        // Creating substrings using both methods
        String substringUsingCharAt = subStringUsingCharAt(str, start, end);
        String substringUsingSubstring = subStringUsingSubstring(str, start, end);

        // Comparing the substrings
        boolean areSubstringsEqual = compareStrings(substringUsingCharAt, substringUsingSubstring);

        // Displaying the results
        System.out.println("Substring using charAt: " + substringUsingCharAt);
        System.out.println("Substring using substring: " + substringUsingSubstring);
        System.out.println("Are the substrings equal? " + areSubstringsEqual);

        sc.close(); // Closing the scanner
    }
}
