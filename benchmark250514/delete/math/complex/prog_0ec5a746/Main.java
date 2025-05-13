import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;
import org.apache.commons.math3.linear.RealMatrixPreservingVisitor;

public class Main {
    public static void main(String[] args) {
        double[][] data = { {1.0, 2.0}, {3.0, 4.0} };
        
        /* write */ BlockRealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);
        
        // Manipulate the matrix using a visitor to add 1 to each element
        matrix.walkInOptimizedOrder(new RealMatrixChangingVisitor() {
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {}
            public double visit(int row, int column, double value) {
                return value + 1;
            }
            public double end() {
                return 0;
            }
        });
        
        // Calculate the sum of all elements using a preserving visitor
        final double[] sum = {0};
        matrix.walkInOptimizedOrder(new RealMatrixPreservingVisitor() {
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {}
            public void visit(int row, int column, double value) {
                sum[0] += value;
            }
            public double end() {
                return sum[0];
            }
        });
        
        System.out.println("Sum of all elements: " + sum[0]);
        
        // Create another matrix and perform matrix multiplication
        double[][] data2 = { {5.0, 6.0}, {7.0, 8.0} };
        BlockRealMatrix matrix2 = MatrixUtils.createBlockRealMatrix(data2);
        RealMatrix resultMatrix = matrix.multiply(matrix2);
        
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Additional operations to make the program more complex
        double[][] data3 = { {9.0, 10.0}, {11.0, 12.0} };
        BlockRealMatrix matrix3 = MatrixUtils.createBlockRealMatrix(data3);
        RealMatrix addedMatrix = matrix.add(matrix3);
        
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* read */ BlockRealMatrix readMatrix = MatrixUtils.getBlockRealMatrix(matrix.getData());
        
        System.out.println("Read matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}