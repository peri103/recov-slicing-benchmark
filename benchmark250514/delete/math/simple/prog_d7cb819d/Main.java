import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using MatrixUtils
        double[][] data = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data.length, data[0].length, data);

        // Read the sparse matrix using MatrixUtils
        /* read */ RealMatrix readSparseMatrix = sparseMatrix; // Directly use the sparseMatrix as there's no getSparseMatrix method

        // Print the read sparse matrix
        for (int i = 0; i < readSparseMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readSparseMatrix.getColumnDimension(); j++) {
                System.out.print(readSparseMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}