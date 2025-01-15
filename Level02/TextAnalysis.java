import java.util.Scanner;

public class TextAnalysis {

    // Method to split text into words without using split() method
    public static String[] splitTextIntoWords(String text) {
        String[] words = new String[100];
        int wordCount = 0;
        String currentWord = "";

        for (int i = 0; i < getLength(text); i++) {
            char ch = text.charAt(i);
            if (ch == ' ' && !currentWord.isEmpty()) {
                words[wordCount++] = currentWord;
                currentWord = "";
            } else if (ch != ' ') {
                currentWord += ch;
            }
        }
        if (!currentWord.isEmpty()) {
            words[wordCount++] = currentWord;
        }

        String[] result = new String[wordCount];
        System.arraycopy(words, 0, result, 0, wordCount);
        return result;
    }

    // Method to find the length of a string without using length() method
    public static int getLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to find the shortest and longest words
    public static String[] findShortestAndLongest(String[] words) {
        String shortest = words[0], longest = words[0];

        for (String word : words) {
            if (getLength(word) < getLength(shortest)) {
                shortest = word;
            }
            if (getLength(word) > getLength(longest)) {
                longest = word;
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = scanner.nextLine();

        String[] words = splitTextIntoWords(text);
        String[] shortestAndLongest = findShortestAndLongest(words);

        System.out.println("Shortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);

        scanner.close();
    }
}
