import org.apache.commons.math3.linear.DefaultRealMatrixPreservingVisitor;

public class Main {
    public static void main(String[] args) {
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

        /* write */ visitor.visit(0, 0, 5.0);
        /* read */ double result = visitor.end();
        System.out.println(result);
    }
}