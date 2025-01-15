import java.util.Scanner;

public class SplitWordIntoText {

    // Method to split text into words without using split()
    public static String[] splitWords(String text) {
        String word = "";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                if (!word.isEmpty()) {
                    count++;
                    word = "";
                }
            } else {
                word += text.charAt(i);
            }
        }
        if (!word.isEmpty()) count++;

        String[] words = new String[count];
        word = "";
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                if (!word.isEmpty()) {
                    words[index++] = word;
                    word = "";
                }
            } else {
                word += text.charAt(i);
            }
        }
        if (!word.isEmpty()) words[index] = word;
        return words;
    }

    // Method to find length without using length()
    public static int findLength(String word) {
        int length = 0;
        for (char c : word.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to create a 2D array of words and lengths
    public static String[][] wordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = scanner.nextLine();

        String[] words = splitWords(input);
        String[][] result = wordLengthArray(words);

        System.out.println("Word\tLength");
        for (String[] pair : result) {
            System.out.println(pair[0] + "\t" + pair[1]);
        }

        scanner.close();
    }
}
