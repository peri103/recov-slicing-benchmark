import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class SparseMatrixHandler {
    private RealMatrix sparseMatrix;

    public SparseMatrixHandler(int rows, int columns) {
        /* write */
        this.sparseMatrix = MatrixUtils.createSparseMatrix(rows, columns);
    }

    public RealMatrix getSparseMatrix() {
        return sparseMatrix;
    }
}
