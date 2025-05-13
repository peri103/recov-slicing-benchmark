import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class MatrixOperations {
    private RealMatrix identityMatrix;

    public void createIdentityMatrix(int size) {
        /* write */ identityMatrix = MatrixUtils.createIdentityMatrix(size);
    }

    public RealMatrix getIdentityMatrix() {
        return identityMatrix;
    }

    public RealVector multiplyWithVector(double[] vectorData) {
        RealVector vector = new ArrayRealVector(vectorData);
        return identityMatrix.operate(vector);
    }

    public RealMatrix addMatrix(RealMatrix matrixToAdd) {
        return identityMatrix.add(matrixToAdd);
    }
}
