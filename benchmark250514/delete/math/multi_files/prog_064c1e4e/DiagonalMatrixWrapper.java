import org.apache.commons.math3.linear.DiagonalMatrix;

public class DiagonalMatrixWrapper {
    private DiagonalMatrix matrix;

    public DiagonalMatrixWrapper(int size) {
        this.matrix = new DiagonalMatrix(size);
    }

    public void setDiagonalEntry(int index, double value) {
        /* write */ matrix.setEntry(index, value);
    }

    public double getDiagonalEntry(int index) {
        return matrix.getEntry(index);
    }
}
