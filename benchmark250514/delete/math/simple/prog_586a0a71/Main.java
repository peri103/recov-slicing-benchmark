import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using the write method
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(3, 3);
        
        // Read the sparse matrix using the read method
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getSparseMatrix(sparseMatrix);
        
        // Print the retrieved matrix to verify correctness
        System.out.println(retrievedMatrix);
    }
}