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
        
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data.length, data[0].length);
        
        // Set the non-zero values in the sparse matrix
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != 0) {
                    sparseMatrix.setEntry(i, j, data[i][j]);
                }
            }
        }
        
        // Read the sparse matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = sparseMatrix;
        
        // Print the read matrix
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}