import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class ComplexMatrixOperations {
    private RealMatrix matrix;

    public ComplexMatrixOperations(double[][] matrixData) {
        matrix = new Array2DRowRealMatrix(matrixData);
    }

    public RealMatrix addMatrix(RealMatrix otherMatrix) {
        return matrix.add(otherMatrix);
    }

    public RealMatrix multiplyByTranspose() {
        return matrix.multiply(matrix.transpose());
    }
}
