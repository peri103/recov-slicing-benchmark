import org.apache.commons.math3.linear.SymmetricMatrix;

public class MatrixReader {
    public double readMatrixEntry(SymmetricMatrix matrix, int row, int column) {
        /* read */ return matrix.getEntry(row, column);
    }
}
