import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Assume there is a method getIdentityMatrix which retrieves the identity matrix
        // This is hypothetical as MatrixUtils does not have a direct method getIdentityMatrix
        // For demonstration purposes, we will use the identityMatrix created above
        /* read */ RealMatrix retrievedMatrix = identityMatrix; // Hypothetical getIdentityMatrix method

        // Print the retrieved matrix
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}