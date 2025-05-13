import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(double[] rowData) {
        /* write */ this.matrix = MatrixUtils.createRowRealMatrix(rowData);
    }

    public RealMatrix getMatrix() {
        return this.matrix;
    }

    public RealMatrix multiplyMatrix(double scalar) {
        return this.matrix.scalarMultiply(scalar);
    }

    public double getDeterminant() {
        return this.matrix.getDeterminant();
    }
}
