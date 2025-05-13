import org.apache.commons.math3.linear.DefaultRealMatrixPreservingVisitor;

public class Main {
    public static void main(String[] args) {
        // Initialize the DefaultRealMatrixPreservingVisitor
        DefaultRealMatrixPreservingVisitor visitor = new DefaultRealMatrixPreservingVisitor() {
            private double sum = 0;

            @Override
            public void visit(int row, int column, double value) {
                /* write */ sum += value;
            }

            @Override
            public double end() {
                /* read */ return sum;
            }
        };

        // Simulate visiting elements in a matrix
        visitor.visit(0, 0, 1.0);
        visitor.visit(0, 1, 2.0);
        visitor.visit(1, 0, 3.0);
        visitor.visit(1, 1, 4.0);

        // End the visit and read the result
        double result = visitor.end();
        System.out.println(result);
    }
}