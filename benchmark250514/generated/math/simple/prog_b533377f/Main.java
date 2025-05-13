import org.apache.commons.math3.linear.DefaultRealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        DefaultRealMatrixChangingVisitor visitor = new DefaultRealMatrixChangingVisitor() {
            private double value;

            @Override
            public double visit(int row, int column, double value) {
                this.value = value;
                return value;
            }

            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                // Initialize or do nothing
            }

            @Override
            public double end() {
                return value;
            }
        };

        /* write */ visitor.visit(0, 0, 42.0);
        /* read */ double result = visitor.end();
        System.out.println(result);
    }
}