import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(double[][] data) {
        this.matrix = MatrixUtils.createRealMatrix(data);
    }

    public void setRowVector(int row, double[] rowData) {
        RealVector rowVector = MatrixUtils.createRowRealVector(rowData);
        /* write */ matrix.setRowVector(row, rowVector);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }
}
