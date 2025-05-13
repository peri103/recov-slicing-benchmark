import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public void createTriangularMatrix(double[][] data) {
        /* write */ matrix = MatrixUtils.createRealMatrix(data);
    }

    public RealMatrix getTriangularMatrix() {
        return matrix;
    }
}
