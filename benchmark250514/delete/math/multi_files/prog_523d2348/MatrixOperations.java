import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(double[][] initialData) {
        this.matrix = MatrixUtils.createRealMatrix(initialData);
    }

    public void setRowVector(int row, double[] data) {
        /* write */ RealVector rowVector = MatrixUtils.createRowRealVector(data);
        matrix.setRowVector(row, rowVector);
    }

    public RealVector getRowVector(int row) {
        return matrix.getRowVector(row);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }
}
