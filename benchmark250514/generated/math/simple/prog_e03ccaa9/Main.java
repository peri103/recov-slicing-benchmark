import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

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
                /* write */ sum += value;
                return value;
            }

            @Override
            public double end() {
                /* read */ return sum;
            }
        };

        // Example usage
        visitor.start(3, 3, 0, 2, 0, 2);
        visitor.visit(0, 0, 1.0);
        visitor.visit(0, 1, 2.0);
        visitor.visit(0, 2, 3.0);
        visitor.visit(1, 0, 4.0);
        visitor.visit(1, 1, 5.0);
        visitor.visit(1, 2, 6.0);
        visitor.visit(2, 0, 7.0);
        visitor.visit(2, 1, 8.0);
        visitor.visit(2, 2, 9.0);
        double result = visitor.end();
        System.out.println(result); // Should print the sum of the matrix elements
    }
}