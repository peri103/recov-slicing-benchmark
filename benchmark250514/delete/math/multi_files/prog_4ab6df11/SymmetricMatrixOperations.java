import org.apache.commons.math3.linear.SymmetricMatrix;

public class SymmetricMatrixOperations {
    private SymmetricMatrix matrix;

    public SymmetricMatrixOperations(int size) {
        matrix = new SymmetricMatrix(size);
    }

    public void setMatrixEntry(int row, int column, double value) {
        /* write */ matrix.setEntry(row, column, value);
    }

    public SymmetricMatrix getMatrix() {
        return matrix;
    }
}
