import org.apache.commons.math3.linear.DefaultRealMatrixChangingVisitor;

public class MatrixVisitor extends DefaultRealMatrixChangingVisitor {
    private double sum = 0;

    @Override
    public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
        // Initialization if needed
    }

    @Override
    public double visit(int row, int column, double value) {
        /* write */ sum += value;
        return value;
    }

    @Override
    public double end() {
        return sum;
    }
}