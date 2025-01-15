import java.util.Scanner;

public class WordSplitter {

    // Method to split the text into words using charAt() without using StringBuilder
    public static String[] splitTextIntoWords(String text) {
        int wordCount = 0;
        String[] words = new String[100]; // Assumed max 100 words in the input
        String word = "";
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            // If the character is a space, consider it as a separator for words
            if (ch == ' ') {
                if (!word.isEmpty()) {
                    words[wordCount++] = word;
                    word = ""; // Reset word
                }
            } else {
                word += ch; // Append character to the current word
            }
        }

        // Add the last word if any
        if (!word.isEmpty()) {
            words[wordCount++] = word;
        }

        // Return only the non-null words
        String[] result = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            result[i] = words[i];
        }
        return result;
    }

    // Method to calculate the length of a word without using the length() method
    public static String calculateLength(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            count++;
        }
        return String.valueOf(count); // Return length as String
    }

    // Method to create a 2D array with word and its length
    public static String[][] getWordWithLength(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i]; // Word
            wordLengthArray[i][1] = calculateLength(words[i]); // Length
        }

        return wordLengthArray;
    }

    // Main function to take input and display the result in tabular format
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a text:");
        String text = scanner.nextLine();
        
        // Get the words from the text
        String[] words = splitTextIntoWords(text);

        // Get the word and length 2D array
        String[][] wordLengthArray = getWordWithLength(words);

        // Display the result in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("-------------------------");
        
        for (String[] wordInfo : wordLengthArray) {
            if (wordInfo[0] != null) {
                System.out.println(wordInfo[0] + "\t\t" + Integer.valueOf(wordInfo[1]));
            }
        }
        
        scanner.close();
    }
}
