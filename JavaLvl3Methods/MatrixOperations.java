import java.util.Random;

public class MatrixOperations {

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // Random numbers between 0-9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;
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
        int rows = mat1.length;
        int cols = mat1[0].length;
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
        int rows = mat1.length;
        int cols = mat2[0].length;
        int commonDim = mat1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < commonDim; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        double determinant = determinant2x2(matrix);
        if (determinant == 0) throw new ArithmeticException("Matrix is singular and cannot be inverted.");

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / determinant;
        inverse[0][1] = -matrix[0][1] / determinant;
        inverse[1][0] = -matrix[1][0] / determinant;
        inverse[1][1] = matrix[0][0] / determinant;

        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double elem : row) {
                System.out.printf("%.2f\t", elem);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Generating random matrices...");

        // Example: Create two random 2x2 matrices
        int[][] mat1 = createRandomMatrix(2, 2);
        int[][] mat2 = createRandomMatrix(2, 2);

        System.out.println("\nMatrix 1:");
        displayMatrix(mat1);

        System.out.println("\nMatrix 2:");
        displayMatrix(mat2);

        // Perform addition
        System.out.println("\nAddition of Matrices:");
        displayMatrix(addMatrices(mat1, mat2));

        // Perform subtraction
        System.out.println("\nSubtraction of Matrices:");
        displayMatrix(subtractMatrices(mat1, mat2));

        // Perform multiplication
        System.out.println("\nMultiplication of Matrices:");
        displayMatrix(multiplyMatrices(mat1, mat2));

        // Transpose of Matrix 1
        System.out.println("\nTranspose of Matrix 1:");
        displayMatrix(transposeMatrix(mat1));

        // Determinant and Inverse of Matrix 1 if it's a 2x2 matrix
        if (mat1.length == 2 && mat1[0].length == 2) {
            System.out.println("\nDeterminant of Matrix 1: " + determinant2x2(mat1));

            try {
                System.out.println("\nInverse of Matrix 1:");
                displayMatrix(inverse2x2(mat1));
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("\nDeterminant and Inverse are only supported for 2x2 matrices.");
        }
    }
}






























































