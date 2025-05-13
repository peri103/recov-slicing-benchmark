import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class DiagonalMatrixHandler {
    private RealMatrix matrix;

    public void createMatrix(double[] diagonal) {
        /* write */ matrix = MatrixUtils.createDiagonalMatrix(diagonal);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }
}
