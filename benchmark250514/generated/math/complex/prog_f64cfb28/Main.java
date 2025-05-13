import org.apache.commons.math3.linear.RealMatrixChangingVisitor;
import org.apache.commons.math3.linear.RealMatrixPreservingVisitor;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a simple matrix for demonstration
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        Array2DRowRealMatrix matrix = new Array2DRowRealMatrix(data);

        // Visitor to change the matrix and compute sum
        RealMatrixChangingVisitor visitor = new RealMatrixChangingVisitor() {
            private double sum = 0;

            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                sum = 0;
            }

            @Override
            public double visit(int row, int column, double value) {
                /* write */ sum += value;
                return value * 2; // Example transformation: double the value
            }

            @Override
            public double end() {
                /* read */ return sum;
            }
        };

        // Apply the visitor to the matrix
        matrix.walkInRowOrder(visitor);

        // Unrelated visitor to calculate the product of matrix elements
        RealMatrixPreservingVisitor productVisitor = new RealMatrixPreservingVisitor() {
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

        matrix.walkInRowOrder(productVisitor);
        double productResult = productVisitor.end();
        System.out.println("Product of matrix elements: " + productResult);

        // Retrieve the sum from the original visitor
        double result = visitor.end();
        System.out.println("Sum of original matrix elements: " + result);

        // Additional calculation unrelated to matrix visitors
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Another unrelated visitor pattern
        RealMatrixPreservingVisitor sumVisitor = new RealMatrixPreservingVisitor() {
            private double sum = 0;

            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                sum = 0;
            }

            @Override
            public void visit(int row, int column, double value) {
                sum += value;
            }

            @Override
            public double end() {
                return sum;
            }
        };

        matrix.walkInRowOrder(sumVisitor);
        double sumResult = sumVisitor.end();
        System.out.println("Sum of matrix elements after transformation: " + sumResult);
    }
}