import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a square matrix with given dimensions
        int dimension = 3;
        double[][] data = {
            {1.0, 0.0, 0.0},
            {2.0, 1.0, 0.0},
            {3.0, 2.0, 1.0}
        };

        // Create a triangular matrix using MatrixUtils
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createRealMatrix(data);

        // Read the triangular matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.createRealMatrix(triangularMatrix.getData());

        // Print the matrix to verify the operations
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}