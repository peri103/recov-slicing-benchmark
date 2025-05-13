import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Assuming the methods mentioned are hypothetical as they don't exist in the Apache Commons Math library.
        // For demonstration purposes, let's assume these methods work as described.

        // Create a 3x3 matrix for demonstration purposes
        double[][] data = {
            {1, 0, 0},
            {2, 3, 0},
            {4, 5, 6}
        };

        // Create a triangular matrix using the hypothetical method
        /* write */
        RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Retrieve the triangular matrix using the hypothetical method
        /* read */
        RealMatrix readMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the matrix to verify
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}