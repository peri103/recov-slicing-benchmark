import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class MatrixOperations {
    private Array2DRowRealMatrix matrix;

    public MatrixOperations(int rows, int columns) {
        this.matrix = new Array2DRowRealMatrix(rows, columns);
    }

    public void setMatrixEntry(int row, int column, double value) {
        /* write */ matrix.setEntry(row, column, value);
    }

    public double getMatrixEntry(int row, int column) {
        return matrix.getEntry(row, column);
    }

    public RealMatrix addMatrix(RealMatrix otherMatrix) {
        return matrix.add(otherMatrix);
    }

    public RealMatrix multiplyMatrix(RealMatrix otherMatrix) {
        return matrix.multiply(otherMatrix);
    }
}
