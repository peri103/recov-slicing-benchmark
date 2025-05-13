import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public void createDiagonalMatrix(double[] diagonalValues) {
        /* write */ matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }
}
