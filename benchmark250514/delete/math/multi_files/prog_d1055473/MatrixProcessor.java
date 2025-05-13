import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class MatrixProcessor {
    private RealMatrix matrix;

    public MatrixProcessor(RealMatrix matrix) {
        this.matrix = matrix;
    }

    public RealVector multiplyWithVector(double[] vectorData) {
        RealVector vector = new ArrayRealVector(vectorData);
        return matrix.operate(vector);
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