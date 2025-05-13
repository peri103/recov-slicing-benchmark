import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealMatrixPreservingVisitor;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with some values
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        RealMatrix matrix = new Array2DRowRealMatrix(data);

        // Create a visitor that will sum all elements in the matrix
        RealMatrixPreservingVisitor visitor = new RealMatrixPreservingVisitor() {
            private double sum = 0;

            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                sum = 0;
            }

            @Override
            public void visit(int row, int column, double value) {
                /* write */ sum += value;
            }

            @Override
            public double end() {
                /* read */ return sum;
            }
        };

        // Use the visitor on the matrix
        matrix.walkInOptimizedOrder(visitor);

        // Get the result from the visitor
        double result = visitor.end();
        System.out.println("Sum of all elements in the matrix: " + result);
    }
}