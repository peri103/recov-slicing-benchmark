import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public void createSymmetricMatrix(double[][] data) {
        /* write */ matrix = MatrixUtils.createSymmetricMatrix(data);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }

    public RealMatrix transposeMatrix() {
        return matrix.transpose();
    }

    public RealMatrix multiplyWithTranspose() {
        return matrix.multiply(transposeMatrix());
    }
}
