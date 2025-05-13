import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix triangularMatrix;

    public MatrixOperations(double[][] data) {
        // Create a triangular matrix
        /* write */ this.triangularMatrix = MatrixUtils.createTriangularMatrix(data);
    }

    public RealMatrix getTriangularMatrix() {
        return this.triangularMatrix;
    }
}