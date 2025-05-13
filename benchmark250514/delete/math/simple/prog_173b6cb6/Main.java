import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Assuming getIdentityMatrix is a custom method we define to retrieve the identity matrix
        /* read */ RealMatrix retrievedMatrix = getIdentityMatrix(identityMatrix);

        // Print the retrieved matrix to verify it is the same as the one created
        System.out.println(retrievedMatrix);
    }

    // Custom method to mimic the behavior of "getIdentityMatrix"
    public static RealMatrix getIdentityMatrix(RealMatrix matrix) {
        return matrix;
    }
}