import org.apache.commons.math3.linear.SymmetricMatrix;

public class SymmetricMatrixWrapper {
    private SymmetricMatrix matrix;

    public SymmetricMatrixWrapper(int size) {
        this.matrix = new SymmetricMatrix(size);
    }

    public void setMatrixEntry(int row, int col, double value) {
        /* write */ matrix.setEntry(row, col, value);
    }

    public double getMatrixEntry(int row, int col) {
        return matrix.getEntry(row, col);
    }
}