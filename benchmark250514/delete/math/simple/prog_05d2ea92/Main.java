import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using MatrixUtils
        RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(3, 3);
        
        // Populate the matrix with some values
        sparseMatrix.setEntry(0, 0, 1.0);
        sparseMatrix.setEntry(1, 1, 2.0);
        sparseMatrix.setEntry(2, 2, 3.0);
        
        // Read the sparse matrix using MatrixUtils
        /* read */ RealMatrix readSparseMatrix = MatrixUtils.getSparseMatrix(sparseMatrix);
        
        // Print the matrix to verify
        for (int i = 0; i < readSparseMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readSparseMatrix.getColumnDimension(); j++) {
                System.out.print(readSparseMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}