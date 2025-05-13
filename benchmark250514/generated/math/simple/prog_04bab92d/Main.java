import org.apache.commons.math3.linear.RealMatrixPreservingVisitor;

public class Main {
    public static void main(String[] args) {
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

        // Simulate visiting a matrix
        visitor.start(2, 2, 0, 1, 0, 1);
        visitor.visit(0, 0, 1.0);
        visitor.visit(0, 1, 2.0);
        visitor.visit(1, 0, 3.0);
        visitor.visit(1, 1, 4.0);
        double result = visitor.end();

        System.out.println(result); // This should print the sum of all visited values
    }
}