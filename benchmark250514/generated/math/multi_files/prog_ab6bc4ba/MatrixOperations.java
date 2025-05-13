import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(double[][] data) {
        /* write */ this.matrix = MatrixUtils.createRealMatrix(data);
    }

    public RealMatrix getMatrix() {
        return this.matrix;
    }

    public RealMatrix transposeMatrix() {
        return this.matrix.transpose();
    }

    public RealMatrix multiplyWith(RealMatrix otherMatrix) {
        return this.matrix.multiply(otherMatrix);
    }
}
