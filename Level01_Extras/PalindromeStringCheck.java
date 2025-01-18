import java.util.*;

class PalindromeStringCheck {

    // Method to check if the input string is a palindrome
    public static boolean checkPalindrome(String str) {
        // Loop through the string with two pointers: one from the beginning (i) and one from the end (j)
        for (int i = 0, j = str.length() - 1; i < str.length() && j >= 0; i++, j--) {
            // If characters at i and j are not equal, return false (not a palindrome)
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        // If all characters match, return true (is a palindrome)
        return true;
    }

    // Main method to take input from user and check if it's a palindrome
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

    
        System.out.println("Enter the value of String :");

        // Take the input string and remove any leading or trailing spaces
        String str = sc.nextLine().trim();

        // Call checkPalindrome method and display the result
        System.out.println("Is String Palindrome: " + checkPalindrome(str));

 
        sc.close();
    }
}
