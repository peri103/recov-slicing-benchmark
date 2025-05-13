import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize variables
        RealMatrix identityMatrix = null;

        // Use the write method from MatrixUtils to create an identity matrix
        /* write */ identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Use the read method to retrieve the identity matrix
        /* read */ RealMatrix retrievedMatrix = identityMatrix; // Assuming getIdentityMatrix is a hypothetical method

        // Print the matrix to verify
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}