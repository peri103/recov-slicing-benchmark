import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(RealMatrix matrix) {
        this.matrix = matrix;
    }

    public RealVector readVector() {
        /* read */ return matrix.getRowVector(0);
    }

    public RealMatrix multiplyMatrix(RealMatrix otherMatrix) {
        return matrix.multiply(otherMatrix);
    }

    public RealMatrix scaleMatrix(double scalar) {
        return matrix.scalarMultiply(scalar);
    }
}