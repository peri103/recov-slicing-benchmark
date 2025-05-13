import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize necessary variables
        RealMatrix identityMatrix;
        
        // Create an identity matrix of size 3x3
        /* write */ identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Read the identity matrix (in this context, we assume getIdentityMatrix is a hypothetical method to retrieve the matrix)
        /* read */ RealMatrix readMatrix = identityMatrix; // Using the same matrix since getIdentityMatrix isn't a real method

        // Output the matrix to ensure it was read correctly
        System.out.println("Identity Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}