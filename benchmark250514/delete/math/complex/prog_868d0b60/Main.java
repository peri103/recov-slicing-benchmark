import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a DiagonalMatrix with size 1
        DiagonalMatrix matrix = new DiagonalMatrix(1);
        
        // Write a value at index 0
        /* write */ matrix.setEntry(0, 5.0);
        
        // Initialize another matrix for additional operations
        RealMatrix otherMatrix = new Array2DRowRealMatrix(new double[][] {
            {1, 2},
            {3, 4}
        });
        
        // Perform some operations on the other matrix
        RealMatrix resultMatrix = otherMatrix.scalarMultiply(2);
        
        // Print the result of the multiplication
        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // More complex operations
        double sum = 0;
        for (int i = 0; i < otherMatrix.getRowDimension(); i++) {
            for (int j = 0; j < otherMatrix.getColumnDimension(); j++) {
                sum += otherMatrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of all elements in otherMatrix: " + sum);
        
        // Read the value at index 0
        /* read */ double value = matrix.getEntry(0);
        
        // Print the value to verify
        System.out.println("Value from DiagonalMatrix: " + value);
    }
}