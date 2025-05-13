import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix identityMatrix;

    public MatrixOperations(int size) {
        /* write */ this.identityMatrix = MatrixUtils.createIdentityMatrix(size);
    }

    public RealMatrix getIdentityMatrix() {
        return identityMatrix;
    }

    public RealMatrix addMatrix(RealMatrix otherMatrix) {
        return otherMatrix.add(identityMatrix);
    }

    public RealMatrix multiplyMatrix(RealMatrix otherMatrix) {
        return otherMatrix.multiply(identityMatrix);
    }

    public RealMatrix subtractMatrix(RealMatrix otherMatrix) {
        return otherMatrix.subtract(identityMatrix);
    }
}
