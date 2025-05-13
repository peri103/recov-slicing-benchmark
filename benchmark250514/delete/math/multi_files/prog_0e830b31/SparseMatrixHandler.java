import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class SparseMatrixHandler {
    private RealMatrix sparseMatrix;

    public void createSparseMatrix(double[][] data, int rows, int columns) {
        /* write */ sparseMatrix = MatrixUtils.createSparseMatrix(data, rows, columns);
    }

    public RealMatrix getSparseMatrix() {
        return sparseMatrix;
    }
}
