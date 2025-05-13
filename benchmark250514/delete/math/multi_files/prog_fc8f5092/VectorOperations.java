import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class VectorOperations {
    private RealMatrix matrix;

    public VectorOperations(double[] columnData) {
        // Create a matrix with a single column using the write method
        /* write */ this.matrix = MatrixUtils.createColumnRealMatrix(columnData);
    }

    public RealVector getColumnVector(int columnIndex) {
        return matrix.getColumnVector(columnIndex);
    }
}