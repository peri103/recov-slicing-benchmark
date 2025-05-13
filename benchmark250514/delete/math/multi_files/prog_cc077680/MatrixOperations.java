import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public void createMatrix(double[] data) {
        /* write */ this.matrix = MatrixUtils.createRowRealMatrix(data);
    }

    public RealMatrix getMatrix() {
        return this.matrix;
    }

    public RealMatrix addMatrices(RealMatrix otherMatrix) {
        return this.matrix.add(otherMatrix);
    }

    public RealMatrix transposeMatrix() {
        return this.matrix.transpose();
    }
}
