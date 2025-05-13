import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        
        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);
        
        // Adding complexity: Transpose the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        
        // Adding complexity: Create a vector and multiply it with the matrix
        RealVector vector = new ArrayRealVector(new double[]{1.0, 1.0, 1.0});
        RealVector resultVector = transposedMatrix.operate(vector);
        
        // Print the result of the vector multiplication
        System.out.println("Resulting vector after matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Adding more complexity: Apply a visitor to modify the matrix
        matrix.walkInOptimizedOrder(new RealMatrixChangingVisitor() {
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {}
            
            public double visit(int row, int column, double value) {
                return value + 1.0;  // Increment each element by 1
            }
            
            public double end() {
                return 0;
            }
        });
        
        // Perform some unrelated operations
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * 2.5;
        }
        System.out.println("Sum of the first ten multiples of 2.5: " + sum);
        
        // More unrelated operations
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
        
        // Finally, read the matrix data back
        /* read */ double[][] readData = matrix.getData();
        
        System.out.println("Matrix after all operations:");
        for (double[] row : readData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}