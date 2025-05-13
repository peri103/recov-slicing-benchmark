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

        // Simulate visiting a matrix with values
        visitor.start(2, 2, 0, 1, 0, 1);
        visitor.visit(0, 0, 1.0);
        visitor.visit(0, 1, 2.0);
        visitor.visit(1, 0, 3.0);
        visitor.visit(1, 1, 4.0);
        double result = visitor.end();

        System.out.println("Sum of matrix elements: " + result);
    }
}