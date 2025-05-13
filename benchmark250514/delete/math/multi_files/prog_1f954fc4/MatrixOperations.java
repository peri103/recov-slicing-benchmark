import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix triangularMatrix;

    public void createTriangularMatrix(double[][] data) {
        /* write */ triangularMatrix = MatrixUtils.createRealMatrix(data);
    }

    public RealMatrix getTriangularMatrix() {
        return triangularMatrix;
    }

    public RealMatrix addMatrices(RealMatrix anotherMatrix) {
        return triangularMatrix.add(anotherMatrix);
    }

    public RealMatrix multiplyMatrices(RealMatrix anotherMatrix) {
        return triangularMatrix.multiply(anotherMatrix);
    }
}