import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a sparse matrix with dimensions 2x2 and some values
        double[][] data = {
            {1.0, 0.0},
            {0.0, 2.0}
        };
        
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data.length, data[0].length, data);

        // Assuming getSparseMatrix is a hypothetical method for reading the matrix
        // Since there's no actual `getSparseMatrix` method in MatrixUtils, we simulate reading the matrix
        /* read */ RealMatrix readMatrix = sparseMatrix; // Directly using the matrix for demonstration

        // Print the matrix to verify
        for (int row = 0; row < readMatrix.getRowDimension(); row++) {
            for (int col = 0; col < readMatrix.getColumnDimension(); col++) {
                System.out.print(readMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
    }
}