import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MatrixOperations {
    private RealMatrix matrix;

    public void createMatrix(RealVector vector) {
        matrix = new Array2DRowRealMatrix(new double[][]{
            vector.toArray(),
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        });
    }

    public RealMatrix transposeMatrix() {
        return matrix.transpose();
    }

    public RealMatrix multiplyMatrix() {
        return matrix.multiply(transposeMatrix());
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