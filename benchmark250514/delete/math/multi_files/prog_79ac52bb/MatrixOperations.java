import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(double[] columnData) {
        /* write */ this.matrix = MatrixUtils.createColumnRealMatrix(columnData);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }
}
