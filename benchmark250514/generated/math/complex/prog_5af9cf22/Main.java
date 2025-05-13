import org.apache.commons.math3.linear.RealMatrixChangingVisitor;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrixPreservingVisitor;

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
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][]{
            {1, 2},
            {3, 4}
        });

        // Apply the visitor to the matrix
        matrix.walkInOptimizedOrder(visitor);

        // Additional complex operations
        RealMatrixPreservingVisitor preservingVisitor = new RealMatrixPreservingVisitor() {
            private double product = 1;

            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                product = 1;
            }

            @Override
            public void visit(int row, int column, double value) {
                product *= value;
            }

            @Override
            public double end() {
                return product;
            }
        };

        // Walk the matrix with preserving visitor
        matrix.walkInOptimizedOrder(preservingVisitor);

        // Calculate and print the product of all elements
        double productResult = preservingVisitor.end();
        System.out.println("Product of all elements: " + productResult);

        // Read the result from the visitor
        double result = visitor.end();
        System.out.println("Sum of all elements: " + result);  // Output the sum of all matrix elements

        // Additional loop to manipulate matrix values
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                double currentValue = matrix.getEntry(i, j);
                double newValue = currentValue * 2;
                matrix.setEntry(i, j, newValue);
                System.out.println("Updated matrix value at (" + i + ", " + j + "): " + newValue);
            }
        }
    }
}