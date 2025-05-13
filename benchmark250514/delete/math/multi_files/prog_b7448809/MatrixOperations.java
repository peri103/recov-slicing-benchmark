import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(double[][] data) {
        this.matrix = new Array2DRowRealMatrix(data);
    }

    public RealMatrix transpose() {
        return matrix.transpose();
    }

    public RealMatrix multiply() {
        return matrix.multiply(matrix.transpose());
    }

    public RealVector addVectors(RealVector vector1, RealVector vector2) {
        return vector1.add(vector2);
    }
}
