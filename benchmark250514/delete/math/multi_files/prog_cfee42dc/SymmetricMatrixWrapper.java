import org.apache.commons.math3.linear.SymmetricMatrix;

public class SymmetricMatrixWrapper {
    private SymmetricMatrix matrix;

    public SymmetricMatrixWrapper(int size) {
        matrix = new SymmetricMatrix(size);
    }

    public void setMatrixEntry(int row, int column, double value) {
        /* write */ matrix.setEntry(row, column, value);
    }

    public double getMatrixEntry(int row, int column) {
        return matrix.getEntry(row, column);
    }
}
