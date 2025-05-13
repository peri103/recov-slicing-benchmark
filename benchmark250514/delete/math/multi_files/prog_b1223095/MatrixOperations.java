import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public void createMatrix(double[][] data) {
        /* write */ matrix = MatrixUtils.createArray2DRowRealMatrix(data);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }
}
