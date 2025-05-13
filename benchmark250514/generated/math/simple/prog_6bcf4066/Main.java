import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using MatrixUtils
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createRealMatrix(2, 2);
        sparseMatrix.setEntry(0, 0, 1.0);
        sparseMatrix.setEntry(1, 1, 2.0);

        // Since there is no direct method named getSparseMatrix in MatrixUtils,
        // we will use the matrix we have already created.
        /* read */ RealMatrix readMatrix = sparseMatrix;

        // Output the matrix to verify the read operation
        for (int row = 0; row < readMatrix.getRowDimension(); row++) {
            for (int col = 0; col < readMatrix.getColumnDimension(); col++) {
                System.out.print(readMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
    }
}