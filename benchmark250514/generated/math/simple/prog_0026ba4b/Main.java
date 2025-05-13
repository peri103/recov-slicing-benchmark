import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix
        double[][] data = {{1, 2}, {3, 4}};
        RealMatrix matrix = new Array2DRowRealMatrix(data);

        // Create a visitor implementation
        RealMatrixChangingVisitor visitor = new RealMatrixChangingVisitor() {
            private double sum = 0;

            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                sum = 0;
            }

            @Override
            public double visit(int row, int column, double value) {
                /* write */ sum += value;
                return value; // return the unchanged value
            }

            @Override
            public double end() {
                /* read */ return sum;
            }
        };

        // Apply the visitor to the matrix
        matrix.walkInRowOrder(visitor);

        // Get the result from the visitor's end method
        double result = visitor.end();
        System.out.println("Sum of matrix elements: " + result);
    }
}