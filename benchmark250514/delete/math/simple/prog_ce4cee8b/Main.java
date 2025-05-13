import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using MatrixUtils
        RealMatrix sparseMatrix = /* write */ MatrixUtils.createSparseMatrix(3, 3);

        // Retrieve the sparse matrix using MatrixUtils
        RealMatrix retrievedMatrix = /* read */ MatrixUtils.getSparseMatrix(sparseMatrix);

        // Print the retrieved matrix
        System.out.println(retrievedMatrix);
    }
}