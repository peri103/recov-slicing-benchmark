import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        RealMatrixChangingVisitor visitor = new RealMatrixChangingVisitor() {
            private double value;

            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                // Initialization if needed
            }

            @Override
            public double visit(int row, int column, double value) {
                /* write */ this.value = value; // Store the value
                return value; // Return the unchanged value
            }

            @Override
            public double end() {
                /* read */ return this.value; // Retrieve the stored value
            }
        };

        // Simulate visiting a matrix element
        visitor.visit(0, 0, 42.0);

        // Retrieve the value stored during the visit
        double result = visitor.end();
        System.out.println(result);
    }
}