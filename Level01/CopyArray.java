import java.util.Scanner;

class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize a 5x5 2D array
        int[][] arr = new int[5][5];
        int row = 5;
        int col = 5;

        // Taking input for the 2D array
        System.out.println("Enter elements for the 5x5 matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt(); // Input each element
            }
        }

        // Create a 1D array to copy all elements from the 2D array
        int[] arrOne = new int[row * col];
        int index = 0;

        // Copying elements from 2D array to 1D array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arrOne[index] = arr[i][j]; // Corrected indexing
                index++;
            }
        }

        // Displaying the copied elements
        System.out.println("Elements in the 1D array:");
        for (int i = 0; i < arrOne.length; i++) {
            System.out.print(arrOne[i] + " ");
        }
        System.out.println();

        sc.close(); // Close the scanner object
    }
}
