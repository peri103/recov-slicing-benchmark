import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class SymmetricMatrixUtils {
    private RealMatrix symmetricMatrix;

    public void createSymmetricMatrix(double[][] data) {
        /* write */ symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);
    }

    public RealMatrix getSymmetricMatrix() {
        return symmetricMatrix;
    }
}
