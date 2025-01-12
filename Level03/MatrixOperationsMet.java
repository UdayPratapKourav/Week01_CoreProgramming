import java.util.Random;
import java.util.Scanner;

public class MatrixOperationsMet {

    // Method to generate a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random numbers between 0-9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length, cols = mat1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length, cols = mat1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length, cols = mat2[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < mat2.length; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to calculate determinant of a 2x2 matrix
    public static int determinant2x2(int[][] mat) {
        return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
    }

    // Method to calculate determinant of a 3x3 matrix
    public static int determinant3x3(int[][] mat) {
        return mat[0][0] * (mat[1][1] * mat[2][2] - mat[1][2] * mat[2][1]) -
               mat[0][1] * (mat[1][0] * mat[2][2] - mat[1][2] * mat[2][0]) +
               mat[0][2] * (mat[1][0] * mat[2][1] - mat[1][1] * mat[2][0]);
    }

    // Method to find inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] mat) {
        int determinant = determinant2x2(mat);
        if (determinant == 0) {
            throw new ArithmeticException("Matrix is not invertible.");
        }
        double[][] inverse = {
            {(double) mat[1][1] / determinant, (double) -mat[0][1] / determinant},
            {(double) -mat[1][0] / determinant, (double) mat[0][0] / determinant}
        };
        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.printf("%4d", elem);
            }
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double elem : row) {
                System.out.printf("%7.2f", elem);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimensions for matrices (rows and columns):");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix1 = createRandomMatrix(rows, cols);
        int[][] matrix2 = createRandomMatrix(rows, cols);

        System.out.println("\nMatrix 1:");
        displayMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        System.out.println("\nMatrix Addition:");
        displayMatrix(addMatrices(matrix1, matrix2));

        System.out.println("\nMatrix Subtraction:");
        displayMatrix(subtractMatrices(matrix1, matrix2));

        if (rows == cols) {
            System.out.println("\nMatrix Multiplication:");
            displayMatrix(multiplyMatrices(matrix1, matrix2));

            if (rows == 2 && cols == 2) {
                System.out.println("\nDeterminant of Matrix 1: " + determinant2x2(matrix1));
                System.out.println("Inverse of Matrix 1:");
                displayMatrix(inverse2x2(matrix1));
            } else if (rows == 3 && cols == 3) {
                System.out.println("\nDeterminant of Matrix 1: " + determinant3x3(matrix1));
            }
        } else {
            System.out.println("\nMatrix multiplication not possible for non-square matrices.");
        }
    }
}
