import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Read the identity matrix (in this case, we directly use the reference to the created matrix)
        /* read */ RealMatrix retrievedMatrix = identityMatrix;

        // Print the matrix to verify
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}