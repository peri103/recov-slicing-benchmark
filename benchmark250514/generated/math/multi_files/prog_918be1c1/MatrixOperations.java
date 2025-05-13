import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class MatrixOperations {
    private BlockRealMatrix matrix;

    public MatrixOperations(int rows, int columns) {
        matrix = new BlockRealMatrix(rows, columns);
    }

    public void initializeMatrix() {
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                matrix.setEntry(i, j, i * matrix.getColumnDimension() + j);
            }
        }
    }

    public void modifyEntry(int row, int column, double value) {
        /* write */ matrix.setEntry(row, column, value);
    }

    public RealMatrix getTransposedMatrix() {
        return matrix.transpose();
    }

    public double sumAllElements() {
        double sum = 0;
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                sum += matrix.getEntry(i, j);
            }
        }
        return sum;
    }

    public BlockRealMatrix getMatrix() {
        return matrix;
    }
}
