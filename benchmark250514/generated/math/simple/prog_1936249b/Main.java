import org.apache.commons.math3.linear.DefaultRealMatrixPreservingVisitor;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the DefaultRealMatrixPreservingVisitor
        DefaultRealMatrixPreservingVisitor visitor = new DefaultRealMatrixPreservingVisitor() {
            private double sum = 0;

            @Override
            public void visit(int row, int column, double value) {
                sum += value;
            }

            @Override
            public double end() {
                return sum;
            }
        };

        // Simulate visiting matrix elements
        /* write */ visitor.visit(0, 0, 1.0);
        /* write */ visitor.visit(0, 1, 2.0);
        /* write */ visitor.visit(1, 0, 3.0);
        /* write */ visitor.visit(1, 1, 4.0);

        // End the visit and read the result
        /* read */ double result = visitor.end();
        System.out.println(result);
    }
}