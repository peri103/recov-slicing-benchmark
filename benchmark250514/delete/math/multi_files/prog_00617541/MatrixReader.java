import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixReader {

    private RealMatrix matrix;

    public MatrixReader(RealMatrix matrix) {
        this.matrix = matrix;
    }

    public RealVector getColumnVector(int column) {
        /* read */ return matrix.getColumnVector(column);
    }
}
