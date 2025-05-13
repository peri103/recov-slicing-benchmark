import org.apache.commons.math3.linear.RealMatrix;

public class MatrixReader {
    private RealMatrix matrix;

    public MatrixReader(RealMatrix matrix) {
        this.matrix = matrix;
    }

    public double readMatrixEntry(int row, int column) {
        /* read */ return matrix.getEntry(row, column);
    }
}
