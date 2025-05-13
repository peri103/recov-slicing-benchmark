import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix columnMatrix;

    public void createColumnMatrix(double[] columnData) {
        /* write */ columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);
    }

    public RealMatrix getColumnMatrix() {
        return columnMatrix;
    }
}
