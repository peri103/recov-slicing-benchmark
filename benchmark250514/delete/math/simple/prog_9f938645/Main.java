import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        RealMatrix identityMatrix;
        /* write */ identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Read the identity matrix using MatrixUtils
        RealMatrix readMatrix;
        /* read */ readMatrix = identityMatrix;

        // Print the read matrix to verify the operations
        System.out.println(readMatrix);
    }
}