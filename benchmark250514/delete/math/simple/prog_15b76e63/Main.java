import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using MatrixUtils
        RealMatrix matrix = MatrixUtils.createSparseMatrix(3, 3);
        
        // Set a value in the matrix
        matrix.setEntry(0, 0, 5.0);
        
        // Retrieve the sparse matrix using MatrixUtils
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getSparseMatrix(matrix);
        
        // Read the value that was written
        double value = retrievedMatrix.getEntry(0, 0);
        
        // Print the value to ensure correctness
        System.out.println(value);
    }
}