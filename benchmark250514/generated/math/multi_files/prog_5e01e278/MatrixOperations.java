import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public void createMatrix(double[][] data) {
        /* write */ matrix = MatrixUtils.createRealMatrix(data);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }

    public RealMatrix addMatrix(RealMatrix otherMatrix) {
        return matrix.add(otherMatrix);
    }

    public double[] operate(double[] vector) {
        return matrix.operate(vector);
    }
}
