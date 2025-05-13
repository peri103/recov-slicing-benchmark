import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(double[][] data) {
        this.matrix = MatrixUtils.createRealMatrix(data);
    }

    public void setRowVector(int row, RealVector vector) {
        matrix.setRowVector(row, vector);
    }

    public RealVector getRowVector(int row) {
        /* read */ return matrix.getRowVector(row);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }
}
