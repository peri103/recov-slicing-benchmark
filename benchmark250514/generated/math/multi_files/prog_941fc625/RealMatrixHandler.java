import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class RealMatrixHandler {
    private RealMatrix matrix;

    public RealMatrixHandler(double[][] matrixData) {
        this.matrix = new Array2DRowRealMatrix(matrixData);
    }

    public RealVector multiplyWithVector(RealVector vector) {
        return matrix.operate(vector);
    }

    public RealMatrix getTransposedMatrix() {
        return matrix.transpose();
    }
}
