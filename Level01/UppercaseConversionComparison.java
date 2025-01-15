import java.util.Scanner;

public class UppercaseConversionComparison {

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

    // Method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Convert to uppercase using custom method
        String customUppercase = convertToUppercase(inputText.toLowerCase());
        System.out.println("Custom Uppercase: " + customUppercase);

        // Convert to uppercase using built-in method
        String builtInUppercase = inputText.toUpperCase();
        System.out.println("Built-in Uppercase: " + builtInUppercase);

        // Compare and display result
        boolean areEqual = compareStrings(customUppercase, builtInUppercase);
        System.out.println("Are both strings equal? " + areEqual);

        scanner.close();
    }
}
