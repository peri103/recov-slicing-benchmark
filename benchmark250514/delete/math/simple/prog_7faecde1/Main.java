import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using MatrixUtils
        /* write */
        RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(3, 3);
        
        // Assume we have a method to fetch the sparse matrix, here represented as getSparseMatrix
        /* read */
        RealMatrix fetchedMatrix = sparseMatrix; // Assuming getSparseMatrix() would return the matrix
        
        // Display the matrix to verify
        for (int i = 0; i < fetchedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < fetchedMatrix.getColumnDimension(); j++) {
                System.out.print(fetchedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}