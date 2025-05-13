import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class MatrixOperations {
    private RealMatrix matrix;

    public void createDiagonalMatrix(double[] diagonalValues) {
        /* write */ matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }

    public RealVector multiplyWithVector(double[] vectorValues) {
        RealVector vector = new ArrayRealVector(vectorValues);
        return matrix.operate(vector);
    }

    public RealMatrix addIdentityMatrix() {
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(matrix.getRowDimension());
        return matrix.add(identityMatrix);
    }
}
