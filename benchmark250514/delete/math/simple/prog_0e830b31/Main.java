import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize dimensions and data for the sparse matrix
        int rows = 3;
        int columns = 3;
        double[][] data = {
            {0.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 0.0}
        };

        // Create a sparse matrix using MatrixUtils
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data, rows, columns);

        // Read the sparse matrix using MatrixUtils (assuming getSparseMatrix is a valid method)
        // In reality, MatrixUtils does not have a getSparseMatrix method, but for the sake of this task, we assume it exists
        /* read */ RealMatrix readMatrix = sparseMatrix; // Placeholder for getSparseMatrix method

        // Print the matrix to verify the operation
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}