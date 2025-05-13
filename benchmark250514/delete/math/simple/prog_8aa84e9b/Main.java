import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using MatrixUtils
        /* write */
        RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(3, 3);

        // Read the sparse matrix using MatrixUtils
        /* read */
        RealMatrix readMatrix = MatrixUtils.getSparseMatrix(sparseMatrix);

        // Print the matrix to verify
        System.out.println("Sparse Matrix: ");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}