import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class VectorOperations {
    private RealMatrix matrix;

    public VectorOperations() {
        double[][] matrixData = {{0.0, 0.0, 0.0}};
        this.matrix = MatrixUtils.createRealMatrix(matrixData);
    }

    public void writeVector(double[] data) {
        RealVector vector = MatrixUtils.createRowRealVector(data);
        /* write */ matrix.setRowVector(0, vector);
    }

    public RealMatrix getMatrix() {
        return this.matrix;
    }
}