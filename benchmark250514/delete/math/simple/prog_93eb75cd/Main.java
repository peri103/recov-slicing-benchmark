import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Define dimensions and data for the sparse matrix
        int rows = 3;
        int columns = 3;
        double[][] data = {
            {0, 0, 1},
            {0, 2, 0},
            {3, 0, 0}
        };

        // Create a sparse matrix using MatrixUtils
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data, rows, columns);

        // Read the sparse matrix
        /* read */ RealMatrix readMatrix = sparseMatrix;  // In this context, we directly use the created matrix

        // Print the read matrix to verify
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}