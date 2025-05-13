import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(int rows, int columns) {
        this.matrix = MatrixUtils.createRealMatrix(rows, columns);
    }

    public void setMatrixEntry(int row, int column, double value) {
        /* write */ matrix.setEntry(row, column, value);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }
}
