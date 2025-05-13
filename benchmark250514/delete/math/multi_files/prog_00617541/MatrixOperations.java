import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(double[][] data) {
        this.matrix = MatrixUtils.createRealMatrix(data);
    }

    public void setColumnVector(int column, double[] data) {
        RealVector columnVector = MatrixUtils.createColumnRealVector(data);
        /* write */ matrix.setColumnVector(column, columnVector);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }
}
