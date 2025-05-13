import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(double[][] data) {
        this.matrix = new Array2DRowRealMatrix(data);
    }

    public RealVector multiplyWithVector(RealVector vector) {
        return matrix.operate(vector);
    }
}
