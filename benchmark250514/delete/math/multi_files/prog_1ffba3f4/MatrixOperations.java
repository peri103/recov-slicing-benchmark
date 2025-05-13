import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class MatrixOperations {
    private RealMatrix identityMatrix;

    public MatrixOperations(int size) {
        /* write */ this.identityMatrix = MatrixUtils.createIdentityMatrix(size);
    }

    public RealMatrix addMatrix(RealMatrix matrix) {
        return matrix.add(identityMatrix);
    }

    public RealMatrix multiplyMatrix(RealMatrix matrix) {
        return matrix.multiply(identityMatrix);
    }

    public RealMatrix getIdentityMatrix() {
        return identityMatrix;
    }
}
