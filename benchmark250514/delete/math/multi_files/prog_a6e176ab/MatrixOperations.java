import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(double[][] data) {
        this.matrix = MatrixUtils.createRealMatrix(data);
    }

    public void setRowVector(int row, RealVector vector) {
        /* write */ matrix.setRowVector(row, vector);
    }

    public RealVector getRowVector(int row) {
        return matrix.getRowVector(row);
    }

    public void printMatrix() {
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            System.out.println(matrix.getRowVector(i));
        }
    }
}
