import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(double[][] data) {
        matrix = MatrixUtils.createRealMatrix(data);
    }

    public void setRowVector(int row, double[] vectorData) {
        RealVector rowVector = MatrixUtils.createRowRealVector(vectorData);
        /* write */ matrix.setRowVector(row, rowVector);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }
}
