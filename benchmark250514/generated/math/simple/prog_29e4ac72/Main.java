import org.apache.commons.math3.linear.DefaultRealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        // Initialize the visitor
        DefaultRealMatrixChangingVisitor visitor = new DefaultRealMatrixChangingVisitor() {
            private double value;

            @Override
            public double visit(int row, int column, double oldValue) {
                // Store the value using the visit method
                /* write */ value = oldValue + 1;
                return value;
            }

            @Override
            public double end() {
                // Retrieve the value using the end method
                /* read */ return value;
            }
        };

        // Simulate the visit operation
        visitor.visit(0, 0, 5.0);

        // Read the stored value
        double result = visitor.end();
        System.out.println(result);
    }
}