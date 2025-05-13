import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the necessary variables
        int rows = 3;
        int columns = 3;
        double[][] data = {
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        };

        // Create a sparse matrix using the specified method
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(rows, columns, data);

        // Read the sparse matrix using the specified method
        /* read */ RealMatrix readMatrix = MatrixUtils.getSparseMatrix(sparseMatrix);

        // Output the read matrix to verify the value
        System.out.println(readMatrix);
    }
}