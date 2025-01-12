public class NumberChecker03Met {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int[] factors = new int[number];  // Maximum possible factors
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        int[] result = new int[index];  // Trim the array to actual size
        for (int i = 0; i < index; i++) {
            result[i] = factors[i];
        }
        return result;
    }

    // Method to find the greatest factor (excluding the number itself)
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 2];  // Second last element
    }

    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of cubes of factors
    public static long productOfCubesOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sumOfFactorials = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sumOfFactorials += factorial(digit);
            temp /= 10;
        }
        return sumOfFactorials == number;
    }

    // Helper method to calculate factorial
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = 28;

        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(factors));

        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }
}
