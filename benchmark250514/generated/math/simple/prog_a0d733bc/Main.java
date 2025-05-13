import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealMatrixPreservingVisitor;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Create a simple 2x2 matrix for demonstration
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
            {1.0, 2.0},
            {3.0, 4.0}
        });

        // Implementing the RealMatrixPreservingVisitor
        RealMatrixPreservingVisitor visitor = new RealMatrixPreservingVisitor() {
            private double sum = 0;

            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                // Initialization if needed
            }

            @Override
            public void visit(int row, int column, double value) {
                /* write */
                sum += value;
            }

            @Override
            public double end() {
                /* read */
                return sum;
            }
        };

        // Apply the visitor to the matrix
        matrix.walkInOptimizedOrder(visitor);

        // Get the result from the visitor's end method
        double result = visitor.end();
        System.out.println("Sum of all elements: " + result);
    }
}