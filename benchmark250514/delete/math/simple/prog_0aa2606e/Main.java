import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        int size = 3; // Example size for identity matrix
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(size);
        /* read */ RealMatrix readMatrix = identityMatrix; // Since there's no direct getIdentityMatrix method, we use the created matrix directly
        System.out.println(readMatrix);
    }
}