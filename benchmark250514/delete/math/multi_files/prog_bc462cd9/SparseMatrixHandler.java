import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.SparseRealMatrix;

public class SparseMatrixHandler {
    private SparseRealMatrix sparseMatrix;

    public void createMatrix(double[][] data) {
        /* write */ sparseMatrix = MatrixUtils.createSparseMatrix(data);
    }

    public SparseRealMatrix getMatrix() {
        return sparseMatrix;
    }
}