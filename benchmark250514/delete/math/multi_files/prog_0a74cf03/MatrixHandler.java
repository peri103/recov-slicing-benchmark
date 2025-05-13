import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixHandler {
    private RealMatrix matrix;

    public void createMatrix(double[] data) {
        /* write */ matrix = MatrixUtils.createColumnRealMatrix(data);
    }

    public RealMatrix getColumnMatrix(int column) {
        return matrix.getColumnMatrix(column);
    }
}
