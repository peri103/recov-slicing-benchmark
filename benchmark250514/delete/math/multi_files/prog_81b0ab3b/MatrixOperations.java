import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(int size) {
        /* write */ this.matrix = MatrixUtils.createIdentityMatrix(size);
    }

    public RealVector multiplyWithVector(double[] vectorData) {
        RealVector vector = new ArrayRealVector(vectorData);
        return matrix.operate(vector);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }
}
