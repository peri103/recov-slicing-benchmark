import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(RealMatrix matrix) {
        this.matrix = matrix;
    }

    public RealVector operateVector(double[] vectorData) {
        RealVector vector = new ArrayRealVector(vectorData);
        return matrix.operate(vector);
    }

    public RealMatrix getTransposedMatrix() {
        return matrix.transpose();
    }
}
