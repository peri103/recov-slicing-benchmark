import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(double[][] data) {
        matrix = new Array2DRowRealMatrix(data);
    }

    public RealVector operate(RealVector vector) {
        return matrix.operate(vector);
    }
}
