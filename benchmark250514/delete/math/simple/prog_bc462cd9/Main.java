import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SparseRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize variables
        int rows = 3;
        int columns = 3;
        double[][] data = {
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        };

        // Create a sparse matrix using MatrixUtils
        /* write */ SparseRealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data);

        // Read the matrix using MatrixUtils (assuming getSparseMatrix is a valid method, although it doesn't exist in reality)
        /* read */ RealMatrix matrix = sparseMatrix; // Directly using the sparseMatrix as there is no getSparseMatrix method

        // Print the matrix to verify
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}