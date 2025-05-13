import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Assuming a hypothetical method getIdentityMatrix exists to read the identity matrix
        // In reality, MatrixUtils does not have a getIdentityMatrix method, but for the sake of this example, we'll assume it exists
        /* read */ RealMatrix readMatrix = MatrixUtils.getIdentityMatrix(identityMatrix);

        // Print the matrix to verify
        System.out.println(readMatrix);
    }
}