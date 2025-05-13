import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(int rows, int cols) {
        matrix = new Array2DRowRealMatrix(rows, cols);
    }

    public void setEntry(int row, int col, double value) {
        matrix.setEntry(row, col, value);
    }

    public RealMatrix multiply(RealMatrix otherMatrix) {
        return matrix.multiply(otherMatrix);
    }

    public void printMatrix() {
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}
