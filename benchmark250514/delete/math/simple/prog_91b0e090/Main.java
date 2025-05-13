import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using MatrixUtils
        /* write */ OpenMapRealMatrix sparseMatrix = (OpenMapRealMatrix) MatrixUtils.createSparseMatrix(3, 3);
        
        // Set a value in the sparse matrix
        sparseMatrix.setEntry(0, 0, 1.0);
        
        // Read the sparse matrix using MatrixUtils (though this method doesn't actually exist, we will simulate it)
        /* read */ RealMatrix readMatrix = sparseMatrix; // In reality, you would use the appropriate method to retrieve the matrix
        
        // Output the value to ensure the read method works
        System.out.println(readMatrix.getEntry(0, 0)); // Should print 1.0
    }
}