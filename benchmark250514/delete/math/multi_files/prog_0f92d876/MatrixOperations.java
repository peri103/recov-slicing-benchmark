import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(double[][] data) {
        /* write */ matrix = MatrixUtils.createBlockRealMatrix(data);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }

    public RealMatrix transposeMatrix() {
        return matrix.transpose();
    }

    public RealMatrix multiplyMatrix(RealMatrix otherMatrix) {
        return matrix.multiply(otherMatrix);
    }

    public RealMatrix addMatrix(RealMatrix otherMatrix) {
        return matrix.add(otherMatrix);
    }

    public RealMatrix subtractMatrix(RealMatrix otherMatrix) {
        return matrix.subtract(otherMatrix);
    }
}
