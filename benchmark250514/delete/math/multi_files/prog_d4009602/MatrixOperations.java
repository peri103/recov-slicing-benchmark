import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public void createMatrix(double[][] data) {
        /* write */ matrix = MatrixUtils.createBlockRealMatrix(data);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }

    public RealMatrix transposeMatrix() {
        return matrix.transpose();
    }
}
