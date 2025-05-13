import org.apache.commons.math3.linear.RealMatrix;

public class MatrixReader {

    private RealMatrix matrix;

    public MatrixReader(RealMatrix matrix) {
        this.matrix = matrix;
    }

    public double[] retrieveDiagonal() {
        // Assuming getDiagonalMatrix() returns the first row as diagonal
        /* read */ return matrix.getRow(0);
    }
}
