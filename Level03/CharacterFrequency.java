import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in the string
    public static String[][] findCharacterFrequency(String text) {
        // Create an array to store the frequency of characters (ASCII size 256)
        int[] frequency = new int[256];
        
        // Loop through the string to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[256][2]; // Store up to 256 ASCII characters

        int index = 0; // To keep track of the number of unique characters

        // Loop through the frequency array and store characters with their frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Character
                result[index][1] = String.valueOf(frequency[i]); // Frequency
                index++;
            }
        }

        // Return the result array with characters and their frequencies
        return result;
    }

    // Method to display the character frequencies
    public static void displayCharacterFrequency(String[][] result) {
        System.out.println("Character | Frequency");
        System.out.println("-----------------------");

        // Display the characters and their frequencies
        for (int i = 0; i < result.length; i++) {
            if (result[i][0] != null) {
                System.out.println(result[i][0] + "         | " + result[i][1]);
            }
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
