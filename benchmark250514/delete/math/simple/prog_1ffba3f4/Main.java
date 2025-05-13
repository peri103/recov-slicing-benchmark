import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Read the identity matrix
        /* read */ RealMatrix readMatrix = identityMatrix; // Assuming getIdentityMatrix is a hypothetical method that reads the matrix

        // Print the matrix to verify
        System.out.println(readMatrix);
    }
}