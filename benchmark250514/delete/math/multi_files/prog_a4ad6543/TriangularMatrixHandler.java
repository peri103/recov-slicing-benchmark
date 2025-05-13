import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class TriangularMatrixHandler {
    private RealMatrix triangularMatrix;

    public void createTriangularMatrix(double[][] data) {
        /* write */ triangularMatrix = MatrixUtils.createTriangularMatrix(data);
    }

    public RealMatrix getTriangularMatrix() {
        return triangularMatrix;
    }
}
