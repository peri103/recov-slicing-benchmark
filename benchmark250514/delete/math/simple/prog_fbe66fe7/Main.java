import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Read the identity matrix
        /* read */ RealMatrix readMatrix = identityMatrix; // Since there's no direct getIdentityMatrix method, we use the matrix created

        // Print the matrix to verify
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}