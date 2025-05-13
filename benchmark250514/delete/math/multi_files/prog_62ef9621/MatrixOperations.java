import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class MatrixOperations {
    private RealMatrix identityMatrix;

    public void createIdentityMatrix(int size) {
        /* write */ identityMatrix = MatrixUtils.createIdentityMatrix(size);
    }

    public RealMatrix getIdentityMatrix() {
        return identityMatrix;
    }
}
