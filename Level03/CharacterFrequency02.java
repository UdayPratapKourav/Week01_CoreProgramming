import java.util.Scanner;

public class CharacterFrequency02 {

    // Method to find unique characters in a string using charAt() method and return them as 1D array
    public static char[] uniqueCharacters(String text) {
        char[] uniqueChars = new char[text.length()];
        int uniqueIndex = 0;

        // Loop through the string to find the unique characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character is already in the uniqueChars array
            for (int j = 0; j < uniqueIndex; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueIndex] = currentChar;
                uniqueIndex++;
            }
        }

        // Create a new array to store only the unique characters
        char[] result = new char[uniqueIndex];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueIndex);
        return result;
    }

    // Method to find the frequency of characters in a string and return the characters and their frequencies in a 2D array
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Frequency array for 256 ASCII characters
        char[] uniqueChars = uniqueCharacters(text); // Get unique characters

        // Loop through the string to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;
    }

    // Method to display the character frequencies
    public static void displayCharacterFrequency(String[][] result) {
        System.out.println("Character | Frequency");
        System.out.println("-----------------------");

        // Display the unique characters and their frequencies
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "         | " + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the character frequencies
        String[][] frequencies = findCharacterFrequency(input);

        // Display the result
        displayCharacterFrequency(frequencies);

        scanner.close();
    }
}
