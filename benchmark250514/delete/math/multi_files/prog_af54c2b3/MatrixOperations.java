import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private BlockRealMatrix matrix;

    public MatrixOperations(int rows, int columns) {
        matrix = new BlockRealMatrix(rows, columns);
    }

    public void initializeMatrix() {
        // Fill the matrix with some values
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                matrix.setEntry(i, j, i * matrix.getColumnDimension() + j);
            }
        }
    }

    public void setSpecificValue(int row, int column, double value) {
        /* write */ matrix.setEntry(row, column, value);
    }

    public RealMatrix transposeMatrix() {
        return matrix.transpose();
    }

    public RealMatrix scaleMatrix(double scalar) {
        return matrix.scalarMultiply(scalar);
    }

    public double getMatrixEntry(int row, int column) {
        return matrix.getEntry(row, column);
    }
}
