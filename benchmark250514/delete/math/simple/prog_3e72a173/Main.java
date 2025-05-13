import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize necessary variables
        int rows = 2;
        int columns = 2;
        double[][] data = { {1.0, 0.0}, {0.0, 1.0} };

        // Create a sparse matrix using MatrixUtils
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data);

        // Read the sparse matrix using the same reference
        /* read */ RealMatrix readMatrix = sparseMatrix;

        // Print the matrix to ensure the read value is correct
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}