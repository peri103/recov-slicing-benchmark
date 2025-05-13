import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class MatrixOperations {
    private RealMatrix symmetricMatrix;

    public void createMatrix(double[][] data) {
        /* write */ symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);
    }

    public RealMatrix getMatrix() {
        return symmetricMatrix;
    }
}
