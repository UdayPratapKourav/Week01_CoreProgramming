import java.util.Scanner;

public class TextConversionComparison {

    // Method to convert text to uppercase without using toUpperCase()
    public static String convertToUppercase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char) (c - 32);  // Convert to uppercase
            } else {
                result += c;  // Keep character as is
            }
        }
        return result;
    }

    // Method to compare two strings character by character
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Convert to lowercase using built-in method
        String builtInLowercase = inputText.toLowerCase();
        System.out.println("Built-in Lowercase: " + builtInLowercase);

        // Convert to uppercase using custom method
        String customUppercase = convertToUppercase(inputText);
        System.out.println("Custom Uppercase: " + customUppercase);

        // Convert to uppercase using built-in method
        String builtInUppercase = inputText.toUpperCase();
        System.out.println("Built-in Uppercase: " + builtInUppercase);

        // Compare custom uppercase with built-in uppercase
        boolean areEqual = compareStrings(customUppercase, builtInUppercase);
        System.out.println("Are custom and built-in uppercase strings equal? " + areEqual);

        scanner.close();
    }
}
