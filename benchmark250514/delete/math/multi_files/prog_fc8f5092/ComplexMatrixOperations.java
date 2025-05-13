import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class ComplexMatrixOperations {
    private RealMatrix matrix;

    public ComplexMatrixOperations(double[][] data) {
        this.matrix = new Array2DRowRealMatrix(data);
    }

    public RealMatrix transposeMatrix() {
        return matrix.transpose();
    }

    public double sumFirstRow() {
        double rowSum = 0;
        for (int i = 0; i < matrix.getColumnDimension(); i++) {
            rowSum += matrix.getEntry(0, i);
        }
        return rowSum;
    }
}