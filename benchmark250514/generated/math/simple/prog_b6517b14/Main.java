import org.apache.commons.math3.linear.DefaultRealMatrixPreservingVisitor;

public class Main {
    public static void main(String[] args) {
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

        // Simulate visiting matrix elements
        visitor.visit(0, 0, 1.0);
        visitor.visit(0, 1, 2.0);
        visitor.visit(1, 0, 3.0);
        visitor.visit(1, 1, 4.0);

        double result = visitor.end();
        System.out.println(result); // Output should be the sum of visited elements: 10.0
    }
}