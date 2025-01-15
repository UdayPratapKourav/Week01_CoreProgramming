import java.util.Scanner;

public class VowelConsonantChecker {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase for easy comparison
        if (ch >= 'a' && ch <= 'z') { // Check if it is a letter
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants in a string and store results in a 2D array
    public static String[][] analyzeString(String input) {
        int length = input.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char currentChar = input.charAt(i);
            result[i][0] = String.valueOf(currentChar);
            result[i][1] = checkCharacterType(currentChar);
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayResult(String[][] result) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("----------------------------");
        for (String[] row : result) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    // Main method to take user input and display results
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] result = analyzeString(input);
        displayResult(result);

        scanner.close();
    }
}
