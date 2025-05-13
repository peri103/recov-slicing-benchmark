import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixHandler {
    private RealMatrix matrix;

    public void createMatrix(double[] rowData) {
        /* write */ matrix = MatrixUtils.createRowRealMatrix(rowData);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }
}
