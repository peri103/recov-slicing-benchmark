import org.apache.commons.math3.linear.RealMatrix;

public class MatrixAnalyzer {
    private RealMatrix matrix;

    public MatrixAnalyzer(RealMatrix matrix) {
        this.matrix = matrix;
    }

    public double getEntry(int row, int col) {
        /* read */ return matrix.getEntry(row, col);
    }

    public double calculateTrace() {
        double trace = 0.0;
        for (int i = 0; i < Math.min(matrix.getRowDimension(), matrix.getColumnDimension()); i++) {
            trace += matrix.getEntry(i, i);
        }
        return trace;
    }
}
