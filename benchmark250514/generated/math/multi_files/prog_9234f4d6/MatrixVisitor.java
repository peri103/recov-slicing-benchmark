import org.apache.commons.math3.linear.RealMatrixPreservingVisitor;

public class MatrixVisitor implements RealMatrixPreservingVisitor {
    private double sum = 0;

    @Override
    public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
        sum = 0;
    }

    @Override
    public void visit(int row, int column, double value) {
        /* write */ sum += value; // Write operation
    }

    @Override
    public double end() {
        return sum; // Read operation will be called in another file
    }
}
