import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize necessary variables
        RealMatrix matrix;
        
        // Write operation: create an identity matrix
        /* write */ matrix = MatrixUtils.createIdentityMatrix(3);

        // Read operation: get the identity matrix
        /* read */ RealMatrix identityMatrix = matrix;

        // Print the resulting matrix for verification
        for (int i = 0; i < identityMatrix.getRowDimension(); i++) {
            for (int j = 0; j < identityMatrix.getColumnDimension(); j++) {
                System.out.print(identityMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}