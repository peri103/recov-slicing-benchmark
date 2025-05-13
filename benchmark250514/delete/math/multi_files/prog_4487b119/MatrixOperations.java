import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix identityMatrix;

    public void createIdentityMatrix(int size) {
        /* write */ identityMatrix = MatrixUtils.createIdentityMatrix(size);
    }

    public RealMatrix getIdentityMatrix() {
        return identityMatrix;
    }

    public RealMatrix addMatrices(RealMatrix matrixA, RealMatrix matrixB) {
        return matrixA.add(matrixB);
    }

    public RealMatrix multiplyMatrixByScalar(RealMatrix matrix, double scalar) {
        return matrix.scalarMultiply(scalar);
    }
}
