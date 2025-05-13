import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize matrix dimensions and data
        int rows = 2;
        int columns = 2;
        double[][] data = {
            {1.0, 0.0},
            {0.0, 1.0}
        };

        // Create a sparse matrix using MatrixUtils
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(rows, columns, data);

        // Retrieve the matrix using MatrixUtils (in this hypothetical scenario)
        /* read */ RealMatrix retrievedMatrix = sparseMatrix; // Assuming getSparseMatrix() would return this

        // Print the matrix to verify
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}