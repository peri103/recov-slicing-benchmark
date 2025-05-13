import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixHandler {
    private RealMatrix sparseMatrix;

    public void createSparseMatrix(double[][] data) {
        /* write */ sparseMatrix = MatrixUtils.createSparseMatrix(data.length, data[0].length, data);
    }

    public RealMatrix getSparseMatrix() {
        return sparseMatrix;
    }
}
