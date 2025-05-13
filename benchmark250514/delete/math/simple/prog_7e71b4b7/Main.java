import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize dimensions and data for the sparse matrix
        int rows = 3;
        int columns = 3;
        double[][] data = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };

        // Create a sparse matrix using MatrixUtils
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data, rows, columns);

        // Read the sparse matrix back using MatrixUtils (assuming getSparseMatrix is a valid method)
        // Since MatrixUtils does not have a method named getSparseMatrix, we will use the sparseMatrix object directly
        /* read */ double value = sparseMatrix.getEntry(1, 1);

        // Print the value to ensure it was read correctly
        System.out.println("Value at (1, 1): " + value);
    }
}