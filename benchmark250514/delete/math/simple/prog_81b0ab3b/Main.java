import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Read the identity matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getIdentityMatrix(identityMatrix.getRowDimension());

        // Print the read matrix
        System.out.println(readMatrix);
    }
}