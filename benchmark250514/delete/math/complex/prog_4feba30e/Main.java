import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix dimensions and data for the sparse matrix
        int rows = 3;
        int columns = 3;
        double[][] sparseData = {
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        };

        // Additional matrix data for a dense matrix
        double[][] denseData = {
            {5.0, 6.0, 7.0},
            {8.0, 9.0, 10.0},
            {11.0, 12.0, 13.0}
        };

        // Create a sparse matrix using MatrixUtils
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(sparseData);

        // Perform operations on a dense matrix
        RealMatrix denseMatrix = new Array2DRowRealMatrix(denseData);
        RealMatrix transposedMatrix = denseMatrix.transpose();
        RealMatrix multipliedMatrix = denseMatrix.multiply(transposedMatrix);

        // Print the multiplied dense matrix
        System.out.println("Multiplied Dense Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform some unrelated calculations
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares from 0 to 9: " + sum);

        // Retrieve the sparse matrix using MatrixUtils
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getSparseMatrix(sparseMatrix);

        // Print the retrieved sparse matrix to verify the values
        System.out.println("Retrieved Sparse Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}