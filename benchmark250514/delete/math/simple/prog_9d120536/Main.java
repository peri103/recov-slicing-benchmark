import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix of size 3x3
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);
        
        // Read the identity matrix
        /* read */ RealMatrix readMatrix = identityMatrix; // Assuming getIdentityMatrix returns the matrix itself
        
        // Print the matrix to verify
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}