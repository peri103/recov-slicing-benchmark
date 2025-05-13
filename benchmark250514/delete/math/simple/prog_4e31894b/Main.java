import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize dimensions and values for the sparse matrix
        int rows = 3;
        int columns = 3;
        double[][] data = {
            {1.0, 0.0, 0.0},
            {0.0, 2.0, 0.0},
            {0.0, 0.0, 3.0}
        };

        // Create a sparse matrix using the data
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data);

        // Retrieve the sparse matrix
        /* read */ OpenMapRealMatrix retrievedMatrix = (OpenMapRealMatrix) sparseMatrix;

        // Print the retrieved matrix to verify the contents
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}