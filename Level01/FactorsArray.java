import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Initial array size for factors
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors and store them in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Resize the array if needed
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];  // Copy old factors
                    }
                    factors = temp;  // Assign new larger array
                }
                factors[index++] = i;  // Store the factor
            }
        }

        // Display factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
