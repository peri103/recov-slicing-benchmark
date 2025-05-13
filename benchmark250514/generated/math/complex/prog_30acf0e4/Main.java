import org.apache.commons.math3.linear.RealMatrixPreservingVisitor;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        // First Visitor: RealMatrixPreservingVisitor
        RealMatrixPreservingVisitor visitor = new RealMatrixPreservingVisitor() {
            private double sum = 0;

            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                sum = 0;
            }

            @Override
            public void visit(int row, int column, double value) {
                /* write */ sum += value;
            }

            @Override
            public double end() {
                /* read */ return sum;
            }
        };

        // Second Visitor: RealMatrixChangingVisitor for additional complexity
        RealMatrixChangingVisitor changingVisitor = new RealMatrixChangingVisitor() {
            private double product = 1;

            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                product = 1;
            }

            @Override
            public double visit(int row, int column, double value) {
                product *= value;
                return value * 2; // Example of changing the matrix
            }

            @Override
            public double end() {
                return product;
            }
        };

        // Simulating a matrix visit for both visitors
        visitor.start(2, 2, 0, 1, 0, 1);
        changingVisitor.start(2, 2, 0, 1, 0, 1);
        
        visitor.visit(0, 0, 1.0);
        changingVisitor.visit(0, 0, 1.0);
        
        visitor.visit(0, 1, 2.0);
        changingVisitor.visit(0, 1, 2.0);
        
        visitor.visit(1, 0, 3.0);
        changingVisitor.visit(1, 0, 3.0);
        
        visitor.visit(1, 1, 4.0);
        changingVisitor.visit(1, 1, 4.0);
        
        double result = visitor.end();
        double productResult = changingVisitor.end();

        System.out.println("Sum of matrix elements: " + result); // Output should be the sum of the matrix elements: 10.0
        System.out.println("Product of matrix elements: " + productResult); // Output should be the product of the matrix elements: 24.0

        // Additional computation for complexity
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : array) {
            sum += num * 2;
        }
        System.out.println("Sum of doubled array elements: " + sum); // Output should be 30
    }
}