public class NumberChecker05Met {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits using the digits array
    public static int sumOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits using the digits array
    public static int sumOfSquaresOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2); // using Math.pow() to square each digit
        }
        return sumOfSquares;
    }

    // Method to check if the number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return (number % sum == 0); // A Harshad number is divisible by the sum of its digits
    }

    // Method to find the frequency of each digit in the number using a 2D array
    public static void findDigitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[] frequency = new int[10];  // Array to store frequency of digits 0 to 9

        // Counting the frequency of each digit
        for (int digit : digits) {
            frequency[digit]++;
        }

        // Displaying the frequency of each digit in 2D format
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }
    }

    public static void main(String[] args) {
        int number = 21;  // Example number for testing

        // Count of digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Sum of digits
        int sumDigits = sumOfDigits(number);
        System.out.println("Sum of digits: " + sumDigits);

        // Sum of squares of digits
        int sumSquares = sumOfSquaresOfDigits(number);
        System.out.println("Sum of squares of digits: " + sumSquares);

        // Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Find frequency of each digit
        findDigitFrequency(number);
    }
}
