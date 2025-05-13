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

        // Assuming the matrix has been visited using the `visit` method.
        double result = visitor.end();
        System.out.println(result);
    }
}