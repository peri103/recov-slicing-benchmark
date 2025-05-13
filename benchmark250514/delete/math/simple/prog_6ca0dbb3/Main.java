import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using MatrixUtils
        OpenMapRealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(3, 3);
        /* write */ sparseMatrix.setEntry(0, 0, 1.0); // set a value to ensure the matrix is not empty

        // Read the sparse matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = sparseMatrix;
        
        // Print the value at (0, 0) to verify the read operation
        System.out.println(readMatrix.getEntry(0, 0));
    }
}