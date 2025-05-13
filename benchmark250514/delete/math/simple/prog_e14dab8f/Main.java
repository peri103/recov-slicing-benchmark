import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Assuming getIdentityMatrix is a method that retrieves the created identity matrix
        // Note: This is a hypothetical example as MatrixUtils does not have a getIdentityMatrix method.
        /* read */ RealMatrix retrievedMatrix = identityMatrix; // Directly using the created matrix

        // Print the matrix to verify
        System.out.println("Identity Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}