import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    // Function to generate a random guess within a range
    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return low + random.nextInt(high - low + 1);
    }

    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        int guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100, and I will try to guess it.");
        System.out.println("Type 'high' if my guess is too high, 'low' if it's too low, and 'correct' if I guess it right.");

        do {
            guess = generateGuess(low, high);  // Generate a new guess
            System.out.println("Is your number " + guess + "?");
            feedback = scanner.next().toLowerCase();  // Read feedback

            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (!feedback.equals("correct")) {
                System.out.println("Invalid input! Please type 'high', 'low', or 'correct'.");
            }

        } while (!feedback.equals("correct"));

        System.out.println("Yay! I guessed your number: " + guess);
        scanner.close();
    }
}