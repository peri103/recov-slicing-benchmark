import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix dimensions
        int rows = 3;
        int columns = 3;
        
        // Create a sparse matrix using the MatrixUtils class
        /* write */ OpenMapRealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(rows, columns);
        
        // Populate the sparse matrix with some values
        sparseMatrix.setEntry(0, 0, 1.0);
        sparseMatrix.setEntry(1, 1, 2.0);
        sparseMatrix.setEntry(2, 2, 3.0);
        
        // Retrieve the sparse matrix using the MatrixUtils class
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getSparseMatrix(sparseMatrix);
        
        // Print the retrieved matrix values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}