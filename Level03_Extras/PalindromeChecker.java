import java.util.Scanner;

public class PalindromeChecker {




        // Function to check if a string is a palindrome
        public static boolean isPalindrome(String text) {
            int length = text.length();
            for (int i = 0; i < length / 2; i++) {
                if (text.charAt(i) != text.charAt(length - 1 - i)) {
                    return false;
                }
            }
            return true;
        }

        // Main function to handle input and output
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string to check if it is a palindrome: ");
            String input = scanner.nextLine().toLowerCase().replaceAll("\\s+", "");

            if (isPalindrome(input)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
            scanner.close();
        }
    }




