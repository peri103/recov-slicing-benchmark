import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix symmetricMatrix;

    public MatrixOperations(double[][] data) {
        /* write */
        this.symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);
    }

    public RealMatrix getSymmetricMatrix() {
        return symmetricMatrix;
    }
}
