import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MatrixReader {
    private RealMatrix matrix;

    public MatrixReader(RealMatrix matrix) {
        this.matrix = matrix;
    }

    public RealVector getRowVector(int rowIndex) {
        /* read */ return matrix.getRowVector(rowIndex);
    }
}
