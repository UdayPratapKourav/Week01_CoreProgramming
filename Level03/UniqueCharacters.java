import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of the text without using String's length() method
    public static int getLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return length;
        }
    }

    // Method to find unique characters using charAt() and return them as 1D array
    public static char[] findUniqueCharacters(String text) {
        int length = getLength(text);
        char[] uniqueChars = new char[length];  // Array to store unique characters
        int uniqueIndex = 0; // To keep track of the next position for unique characters
        
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            
            // Check if the character is already in the uniqueChars array
            for (int j = 0; j < uniqueIndex; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If it's unique, store it in the uniqueChars array
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

    // Method to display the unique characters
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.println("Unique characters in the string:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(input);

        // Display the result
        displayUniqueCharacters(uniqueChars);

        scanner.close();
    }
}
