import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealMatrixPreservingVisitor;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        // Define a simple 2x2 matrix
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        
        // Implement a custom RealMatrixPreservingVisitor
        RealMatrixPreservingVisitor visitor = new RealMatrixPreservingVisitor() {
            private double sum = 0;
            
            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                sum = 0;
            }

            @Override
            public void visit(int row, int column, double value) {
                /* write */
                sum += value;
            }

            @Override
            public double end() {
                /* read */
                return sum;
            }
        };
        
        // Use the visitor to visit the matrix elements
        matrix.walkInOptimizedOrder(visitor);
        
        // Add a new visitor for modifying the matrix
        RealMatrixChangingVisitor changingVisitor = new RealMatrixChangingVisitor() {
            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                // Initialization if needed
            }

            @Override
            public double visit(int row, int column, double value) {
                // Multiply each element by 2
                return value * 2;
            }

            @Override
            public double end() {
                return 0; // No specific end operation needed
            }
        };
        
        // Apply the changing visitor to modify the matrix
        matrix.walkInOptimizedOrder(changingVisitor);
        
        // Output the result of the original visitor's end method
        double result = visitor.end();
        System.out.println("Sum of original matrix elements: " + result);
        
        // Output the modified matrix
        System.out.println("Modified matrix:");
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}