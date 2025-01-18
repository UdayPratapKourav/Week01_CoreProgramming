import java.util.Scanner;

public class CheckAnagrams {

    // Method to check if two strings are anagrams
    public static boolean checkAnagramString(String str1, String str2) {
        // Check if lengths are different, if yes, return false immediately
        if (str1.length() != str2.length()) return false;

        char[] stra = str1.toCharArray();  // Convert first string to character array
        char[] strb = str2.toCharArray();  // Convert second string to character array

        // Loop through each character in the first string
        for (int i = 0; i < stra.length; i++) {
            boolean isCharacterMatched = false;  // Flag to track character match
            for (int j = 0; j < strb.length; j++) {
                if (stra[i] == strb[j]) {  // If characters match
                    isCharacterMatched = true;  // Set flag to true
                    strb[j] = 0;  // Mark character as used by setting it to 0
                    break;  // Exit inner loop
                }
            }
            if (!isCharacterMatched) {  // If no matching character was found
                return false;  // Strings are not anagrams
            }
        }

        return true;  // Strings are anagrams
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        // Check and display if strings are anagrams
        if (checkAnagramString(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
