import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixHandler {
    private RealMatrix sparseMatrix;

    public void createSparseMatrix(int rows, int columns, double[][] data) {
        /* write */ sparseMatrix = MatrixUtils.createSparseMatrix(rows, columns, data);
    }

    public RealMatrix getSparseMatrix() {
        return sparseMatrix;
    }
}
