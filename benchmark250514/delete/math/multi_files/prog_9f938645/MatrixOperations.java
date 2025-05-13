import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix identityMatrix;

    public MatrixOperations(int size) {
        /* write */ identityMatrix = MatrixUtils.createIdentityMatrix(size);
    }

    public RealMatrix getIdentityMatrix() {
        return identityMatrix;
    }

    public RealMatrix multiplyWithIdentity(RealMatrix matrix) {
        return identityMatrix.multiply(matrix);
    }

    public RealMatrix transposeMatrix(RealMatrix matrix) {
        return matrix.transpose();
    }
}
