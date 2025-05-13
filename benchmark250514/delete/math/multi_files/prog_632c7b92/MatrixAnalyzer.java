import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MatrixAnalyzer {
    private RealMatrix matrix;

    public MatrixAnalyzer(RealMatrix matrix) {
        this.matrix = matrix;
    }

    public RealVector getRowVector(int row) {
        /* read */ return matrix.getRowVector(row);
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
