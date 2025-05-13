import org.apache.commons.math3.linear.DiagonalMatrix;

public class DiagonalMatrixHandler {
    private DiagonalMatrix matrix;

    public DiagonalMatrixHandler(int size) {
        this.matrix = new DiagonalMatrix(size);
    }

    public void setMatrixEntry(int index, double value) {
        /* write */ matrix.setEntry(index, value);
    }

    public double getMatrixEntry(int index) {
        return matrix.getEntry(index);
    }
}