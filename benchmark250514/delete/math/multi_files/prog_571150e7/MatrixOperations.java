import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(double[][] data) {
        this.matrix = new Array2DRowRealMatrix(data);
    }

    public RealMatrix transposeMatrix() {
        return matrix.transpose();
    }

    public void printMatrix(RealMatrix matrix) {
        for (int row = 0; row < matrix.getRowDimension(); row++) {
            for (int col = 0; col < matrix.getColumnDimension(); col++) {
                System.out.print(matrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
    }
}
