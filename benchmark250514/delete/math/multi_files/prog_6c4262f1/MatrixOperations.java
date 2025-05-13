import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(double[][] data) {
        matrix = MatrixUtils.createRealMatrix(data);
    }

    public RealMatrix transposeMatrix() {
        return matrix.transpose();
    }
}
