import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize the diagonal values
        double[] diagonalValues = {1.0, 2.0, 3.0};

        // Create a diagonal matrix using the write method
        /* write */ RealMatrix diagonalMatrix = MatrixUtils.createDiagonalMatrix(diagonalValues);

        // Additional code to make the program more complex
        double[][] matrixData = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);
        RealMatrix transposedMatrix = matrix.transpose();
        
        double[][] transposedData = transposedMatrix.getData();
        for (double[] row : transposedData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        
        // Perform some operations on the diagonal matrix
        double sum = 0.0;
        for (int i = 0; i < diagonalValues.length; i++) {
            sum += diagonalValues[i];
        }
        System.out.println("Sum of diagonal values: " + sum);

        // Read the diagonal matrix using the read method
        /* read */ double[] readDiagonal = diagonalMatrix.getRow(0);

        // Print the diagonal values to verify
        for (double value : readDiagonal) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        // More operations on the matrix
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);
        double[][] multipliedData = multipliedMatrix.getData();
        for (double[] row : multipliedData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}