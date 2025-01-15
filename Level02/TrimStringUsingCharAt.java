public class TrimStringUsingCharAt {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find the first non-space character
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        String input = "   Hello World!   ";

        // Trim using custom method
        int[] indices = trimSpaces(input);
        String trimmedCustom = createSubstring(input, indices[0], indices[1]);

        // Trim using built-in trim() method
        String trimmedBuiltIn = input.trim();

        // Compare both trimmed strings
        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Display results
        System.out.println("Original String: [" + input + "]");
        System.out.println("Trimmed (Custom Method): [" + trimmedCustom + "]");
        System.out.println("Trimmed (Built-in trim() Method): [" + trimmedBuiltIn + "]");
        System.out.println("Are both trimmed strings equal? " + areEqual);
    }
}
