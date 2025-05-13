import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(double[][] initialData) {
        this.matrix = MatrixUtils.createRealMatrix(initialData);
    }

    public void replaceRowVector(int rowIndex, double[] vectorData) {
        RealVector rowVector = MatrixUtils.createRowRealVector(vectorData);
        /* write */ matrix.setRowVector(rowIndex, rowVector);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }
}
