import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using the MatrixUtils class
        RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(3, 3);
        
        // Set a value in the sparse matrix for demonstration
        sparseMatrix.setEntry(1, 1, 5.0);
        
        // Read the matrix using the MatrixUtils class
        /* read */ RealMatrix readMatrix = MatrixUtils.getSparseMatrix(sparseMatrix);
        
        // Print the value to demonstrate that the read method works
        System.out.println(readMatrix.getEntry(1, 1));
    }
}