import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Define the dimensions of the sparse matrix
        int rows = 3;
        int columns = 3;
        
        // Create a sparse matrix with the given dimensions
        /* write */ OpenMapRealMatrix sparseMatrix = (OpenMapRealMatrix) MatrixUtils.createSparseMatrix(rows, columns);
        
        // Set some values in the sparse matrix
        sparseMatrix.setEntry(0, 0, 1.0);
        sparseMatrix.setEntry(1, 1, 2.0);
        sparseMatrix.setEntry(2, 2, 3.0);
        
        // Retrieve the sparse matrix
        /* read */ RealMatrix retrievedMatrix = sparseMatrix;
        
        // Print the retrieved matrix entries
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}