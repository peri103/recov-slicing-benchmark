import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize variables for matrix dimensions and data
        int rows = 2;
        int columns = 2;
        double[][] data = {
            {1.0, 0.0},
            {0.0, 1.0}
        };

        // Create a sparse matrix using the specified method
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data, rows, columns);

        // Read the sparse matrix using the specified method
        /* read */ RealMatrix readMatrix = sparseMatrix; // Since there is no getSparseMatrix method, use the created matrix directly

        // Print the matrix to verify the content
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}