import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a DiagonalMatrix with one element
        DiagonalMatrix matrix = new DiagonalMatrix(1);
        
        // Create another DiagonalMatrix with more elements
        DiagonalMatrix matrix2 = new DiagonalMatrix(3);
        
        // Set values in the second matrix
        matrix2.setEntry(0, 10.0);
        matrix2.setEntry(1, 20.0);
        matrix2.setEntry(2, 30.0);
        
        // Perform matrix operations with a RealMatrix
        RealMatrix realMatrix = new Array2DRowRealMatrix(new double[][] {{1, 2}, {3, 4}});
        RealMatrix resultMatrix = realMatrix.multiply(realMatrix);
        
        // Print the result of the matrix multiplication
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Set the value at index 0 in the original matrix
        /* write */ matrix.setEntry(0, 42.0);
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);
        
        // Retrieve the value at index 0 in the original matrix
        /* read */ double value = matrix.getEntry(0);
        
        // Print the value
        System.out.println("Value from DiagonalMatrix: " + value);
        
        // Additional matrix operations
        double trace = 0;
        for (int i = 0; i < matrix2.getRowDimension(); i++) {
            trace += matrix2.getEntry(i);
        }
        System.out.println("Trace of matrix2: " + trace);
    }
}