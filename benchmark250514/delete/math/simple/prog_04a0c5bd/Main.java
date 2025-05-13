import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a sparse matrix using MatrixUtils
        RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(3, 3);
        
        // Perform some operations on the matrix if necessary
        sparseMatrix.setEntry(0, 0, 1.0);
        sparseMatrix.setEntry(1, 1, 2.0);
        sparseMatrix.setEntry(2, 2, 3.0);
        
        // Read the sparse matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = sparseMatrix; // MatrixUtils.getSparseMatrix(sparseMatrix); - hypothetical read method
        
        // Print the matrix to verify the read operation
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}