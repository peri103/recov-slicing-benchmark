import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix symmetricMatrix;

    public void createSymmetricMatrix(double[][] data) {
        /* write */ symmetricMatrix = MatrixUtils.createRealMatrix(data);
    }

    public RealMatrix getSymmetricMatrix() {
        return symmetricMatrix;
    }

    public RealMatrix transposeMatrix() {
        return symmetricMatrix.transpose();
    }

    public RealMatrix multiplyWithTranspose() {
        return symmetricMatrix.multiply(transposeMatrix());
    }
}