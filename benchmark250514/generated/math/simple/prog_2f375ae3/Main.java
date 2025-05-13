import org.apache.commons.math3.linear.DefaultRealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        DefaultRealMatrixChangingVisitor visitor = new DefaultRealMatrixChangingVisitor() {
            private double value;

            @Override
            public double visit(int row, int column, double oldValue) {
                value = oldValue + 1; // Example operation
                /* write */ return value;
            }

            @Override
            public double end() {
                /* read */ return value;
            }
        };

        // Example usage
        double result = visitor.visit(0, 0, 5.0); // This line ensures the write method is executed
        double finalValue = visitor.end(); // This line ensures the read method is executed
        System.out.println(finalValue);
    }
}