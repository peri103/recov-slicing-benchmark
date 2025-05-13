import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class TriangularMatrixHandler {
    private RealMatrix triangularMatrix;

    public void createMatrix(double[][] data) {
        /* write */ triangularMatrix = MatrixUtils.createTriangularMatrix(data);
    }

    public RealMatrix getMatrix() {
        return triangularMatrix;
    }
}
