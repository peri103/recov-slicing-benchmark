import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public void createSymmetricMatrix(double[][] data) {
        /* write */ matrix = MatrixUtils.createSymmetricMatrix(data);
    }

    public RealMatrix getSymmetricMatrix() {
        return matrix;
    }

    public RealMatrix addMatrices(RealMatrix otherMatrix) {
        return matrix.add(otherMatrix);
    }

    public RealMatrix multiplyMatrices(RealMatrix otherMatrix) {
        return matrix.multiply(otherMatrix);
    }
}
