import java.util.Scanner;

public class CharacterFrequency03 {

    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray();  // Convert the string to a character array
        int[] frequency = new int[characters.length];  // Array to store the frequency of each character
        String[] result = new String[characters.length];  // Array to store the result (characters and their frequencies)

        // Loop to find the frequency of each character using nested loops
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '0') {
                continue;  // Skip already counted characters
            }
            int count = 1;  // Initial frequency of the character
            // Inner loop to check for duplicates of the character
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    count++;  // Increment the frequency
                    characters[j] = '0';  // Mark the character as counted
                }
            }
            // Store the character and its frequency in the result array
            result[i] = characters[i] + ": " + count;
        }

        return result;  // Return the result array with characters and their frequencies
    }

    // Method to display the result
    public static void displayCharacterFrequency(String[] result) {
        System.out.println("Character Frequency:");
        for (String res : result) {
            if (res != null) {
                System.out.println(res);  // Display the character and its frequency
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the character frequencies
        String[] frequencies = findCharacterFrequency(input);

        // Display the result
        displayCharacterFrequency(frequencies);

        scanner.close();
    }
}
