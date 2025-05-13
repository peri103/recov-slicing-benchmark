import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(int rows, int columns) {
        this.matrix = MatrixUtils.createRealMatrix(rows, columns);
    }

    public void setRowVector(int rowIndex, double[] rowValues) {
        /* write */ matrix.setRowVector(rowIndex, MatrixUtils.createRowRealVector(rowValues));
    }

    public RealVector getRowVector(int rowIndex) {
        return matrix.getRowVector(rowIndex);
    }

    public RealMatrix addMatrix(RealMatrix otherMatrix) {
        return matrix.add(otherMatrix);
    }

    public RealMatrix scalarMultiply(double scalar) {
        return matrix.scalarMultiply(scalar);
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
