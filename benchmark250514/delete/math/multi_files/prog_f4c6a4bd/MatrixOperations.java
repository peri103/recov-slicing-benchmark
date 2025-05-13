import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(int rows, int cols) {
        matrix = MatrixUtils.createRealMatrix(rows, cols);
    }

    public void fillMatrix() {
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                matrix.setEntry(i, j, i + j);
            }
        }
    }

    public RealMatrix transposeMatrix() {
        return matrix.transpose();
    }

    public void printMatrix(RealMatrix matrix) {
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}
