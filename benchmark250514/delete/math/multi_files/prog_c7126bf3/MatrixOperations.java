import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(double[][] data) {
        this.matrix = MatrixUtils.createRealMatrix(data);
    }

    public void setRowVector(int rowIndex, double[] rowData) {
        RealVector vector = MatrixUtils.createRowRealVector(rowData);
        /* write */ matrix.setRowVector(rowIndex, vector);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }
}
