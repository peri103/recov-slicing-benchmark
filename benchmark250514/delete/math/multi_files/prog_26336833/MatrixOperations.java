import org.apache.commons.math3.linear.SparseRealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;

public class MatrixOperations {
    private SparseRealMatrix matrix;

    public MatrixOperations(int rows, int columns) {
        this.matrix = new OpenMapRealMatrix(rows, columns);
    }

    public void setMatrixEntry(int row, int column, double value) {
        /* write */ matrix.setEntry(row, column, value);
    }

    public SparseRealMatrix getMatrix() {
        return matrix;
    }
}
