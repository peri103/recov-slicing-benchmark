import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations() {
        matrix = MatrixUtils.createRealMatrix(3, 3);
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                matrix.setEntry(i, j, i + j);
            }
        }
    }

    public RealMatrix getMatrix() {
        return matrix;
    }
}
