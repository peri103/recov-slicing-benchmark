import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(int rows, int cols) {
        matrix = MatrixUtils.createRealMatrix(rows, cols);
    }

    public void setMatrixEntry(int row, int col, double value) {
        /* write */ matrix.setEntry(row, col, value);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }
}
