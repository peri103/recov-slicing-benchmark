import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class VectorManager {
    private RealMatrix matrix;

    public VectorManager(double[][] data) {
        this.matrix = MatrixUtils.createRealMatrix(data);
    }

    public void updateRowVector(int rowIndex, double[] newRowData) {
        /* write */ RealVector rowVector = MatrixUtils.createRowRealVector(newRowData);
        this.matrix.setRowVector(rowIndex, rowVector);
    }

    public RealMatrix getMatrix() {
        return this.matrix;
    }
}
