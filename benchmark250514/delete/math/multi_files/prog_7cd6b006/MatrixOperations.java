import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(int rows, int columns) {
        this.matrix = new Array2DRowRealMatrix(rows, columns);
    }

    public void setMatrixEntry(int row, int column, double value) {
        /* write */ matrix.setEntry(row, column, value);
    }

    public double getMatrixEntry(int row, int column) {
        return matrix.getEntry(row, column);
    }

    public RealMatrix getTransposedMatrix() {
        return matrix.transpose();
    }

    public double calculateSum() {
        double sum = 0.0;
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                sum += matrix.getEntry(i, j);
            }
        }
        return sum;
    }
}
