import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public void createMatrix(double[] rowData) {
        /* write */ matrix = MatrixUtils.createRowRealMatrix(rowData);
    }

    public RealMatrix getRowMatrix(int rowIndex) {
        return matrix.getRowMatrix(rowIndex);
    }
}
