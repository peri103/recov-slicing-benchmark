import org.apache.commons.math3.linear.DefaultRealMatrixPreservingVisitor;

public class Main {
    public static void main(String[] args) {
        // Initialize a DefaultRealMatrixPreservingVisitor instance
        DefaultRealMatrixPreservingVisitor visitor = new DefaultRealMatrixPreservingVisitor() {
            private double sum = 0;

            @Override
            public void visit(int row, int column, double value) {
                /* write */ sum += value; // Visit method to accumulate the sum
            }

            @Override
            public double end() {
                /* read */ return sum; // End method to return the accumulated sum
            }
        };

        // Simulate visiting some matrix values
        visitor.visit(0, 0, 1.0);
        visitor.visit(0, 1, 2.0);
        visitor.visit(1, 0, 3.0);
        visitor.visit(1, 1, 4.0);

        // Retrieve the result using the end method
        double result = visitor.end();
        System.out.println(result); // Output the result
    }
}