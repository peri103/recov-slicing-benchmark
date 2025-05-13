import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix identityMatrix;

    public MatrixOperations(int size) {
        // Create an identity matrix using the MatrixUtils class
        /* write */ this.identityMatrix = MatrixUtils.createIdentityMatrix(size);
    }

    public RealMatrix getIdentityMatrix() {
        return identityMatrix;
    }
}
