import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);
        
        // Additional code to make the program more complex
        RealVector vector = new ArrayRealVector(new double[] {1.0, 1.0});
        RealVector resultVector = matrix.operate(vector);
        
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println("Vector entry " + i + ": " + resultVector.getEntry(i));
        }
        
        // Modify the matrix using a visitor
        matrix.walkInOptimizedOrder(new RealMatrixChangingVisitor() {
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                // No initialization required
            }
            
            public double visit(int row, int column, double value) {
                return value + 1.0;
            }
            
            public double end() {
                return 0; // Not used
            }
        });
        
        // Some unrelated arithmetic operations to increase complexity
        int a = 5;
        int b = 10;
        int c = a + b * 2 - 3;
        System.out.println("Result of arithmetic operations: " + c);
        
        // More matrix operations
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ RealMatrix readMatrix = MatrixUtils.getBlockRealMatrix(matrix.getData(), 0, 0, 2, 2);
        
        System.out.println("Read matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}