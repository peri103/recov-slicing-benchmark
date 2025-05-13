import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public void createColumnMatrix(double[] columnData) {
        /* write */ matrix = MatrixUtils.createColumnRealMatrix(columnData);
    }

    public RealMatrix getColumnMatrix(int columnIndex) {
        return MatrixUtils.getColumnRealMatrix(matrix, columnIndex);
    }
}
