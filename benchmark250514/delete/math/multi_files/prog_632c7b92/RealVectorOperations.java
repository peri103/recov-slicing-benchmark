import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class RealVectorOperations {
    private RealMatrix matrix;

    public RealVectorOperations(double[][] data) {
        this.matrix = MatrixUtils.createRealMatrix(data);
    }

    public void setRowVector(int row, double[] rowData) {
        /* write */ RealVector rowVector = MatrixUtils.createRowRealVector(rowData);
        matrix.setRowVector(row, rowVector);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }
}
