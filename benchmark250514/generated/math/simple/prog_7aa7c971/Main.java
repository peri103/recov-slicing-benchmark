import org.apache.commons.math3.linear.DefaultRealMatrixPreservingVisitor;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with sample data
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);

        // Create a visitor
        DefaultRealMatrixPreservingVisitor visitor = new DefaultRealMatrixPreservingVisitor() {
            private double sum = 0.0;

            @Override
            public void visit(int row, int column, double value) {
                /* write */ sum += value; // Visiting each element to calculate the sum
            }

            @Override
            public double end() {
                /* read */ return sum; // Returning the sum after visiting all elements
            }
        };

        // Apply the visitor to the matrix
        matrix.walkInRowOrder(visitor);

        // Get the result from the visitor
        double result = visitor.end();
        System.out.println("Sum of all elements: " + result);
    }
}