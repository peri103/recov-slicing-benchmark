import org.apache.commons.math3.linear.RealMatrixChangingVisitor;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        RealMatrixChangingVisitor visitor = new RealMatrixChangingVisitor() {
            private double sum = 0;

            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                sum = 0;
            }

            @Override
            public double visit(int row, int column, double value) {
                /* write */
                sum += value;
                return value;
            }

            @Override
            public double end() {
                /* read */
                return sum;
            }
        };

        // Example matrix
        RealMatrix matrix = new org.apache.commons.math3.linear.Array2DRowRealMatrix(new double[][]{
            {1, 2},
            {3, 4}
        });

        // Apply the visitor to the matrix
        matrix.walkInOptimizedOrder(visitor);

        // Read the result from the visitor
        double result = visitor.end();
        System.out.println(result);  // Output the sum of all matrix elements
    }
}