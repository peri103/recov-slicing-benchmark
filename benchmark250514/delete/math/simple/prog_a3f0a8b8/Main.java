import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the sparse matrix with dimensions and values
        int numRows = 3;
        int numCols = 3;
        double[][] data = {
            {1.0, 0.0, 0.0},
            {0.0, 2.0, 0.0},
            {0.0, 0.0, 3.0}
        };

        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data);

        // Assuming getSparseMatrix is a method that retrieves the matrix
        // Here, we simulate the retrieval by directly using the sparseMatrix reference
        /* read */ RealMatrix retrievedMatrix = sparseMatrix;

        // Print the matrix to verify
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}