import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class MatrixManipulator {
    public void incrementMatrixElements(RealMatrix matrix) {
        matrix.walkInOptimizedOrder(new RealMatrixChangingVisitor() {
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {}

            public double visit(int row, int column, double value) {
                return value + 1.0;  // Increment each element by 1
            }

            public double end() {
                return 0;
            }
        });
    }
}
