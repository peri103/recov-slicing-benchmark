import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix with dimensions 3x3 and fill with zeros.
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(3, 3);

        // Read the sparse matrix created
        /* read */ RealMatrix readMatrix = MatrixUtils.getSparseMatrix(sparseMatrix);

        // Print the sparse matrix to verify
        System.out.println(readMatrix);
    }
}