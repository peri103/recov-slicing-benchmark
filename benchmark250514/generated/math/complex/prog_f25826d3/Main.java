import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.SparseRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the SparseRealMatrix
        SparseRealMatrix matrix = new OpenMapRealMatrix(3, 3);

        // Initialize another matrix for additional operations
        RealMatrix additionalMatrix = new OpenMapRealMatrix(3, 3);

        // Write a value to the matrix
        /* write */ matrix.setEntry(1, 1, 5.0);

        // Perform some unrelated operations on the additional matrix
        additionalMatrix.setEntry(0, 0, 3.0);
        additionalMatrix.setEntry(2, 2, 7.0);
        
        // Calculate the sum of all entries in additionalMatrix
        double sum = 0.0;
        for (int i = 0; i < additionalMatrix.getRowDimension(); i++) {
            for (int j = 0; j < additionalMatrix.getColumnDimension(); j++) {
                sum += additionalMatrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of additionalMatrix entries: " + sum);

        // Perform some operations on the original matrix
        matrix.setEntry(0, 0, 1.0);
        matrix.setEntry(2, 2, 2.0);
        
        // Calculate the trace of the original matrix
        double trace = 0.0;
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            trace += matrix.getEntry(i, i);
        }
        System.out.println("Trace of matrix: " + trace);

        // Read the value from the matrix
        /* read */ double value = matrix.getEntry(1, 1);

        // Print the value to verify
        System.out.println("Value at (1,1): " + value);
        
        // Perform additional calculations using the original matrix
        double product = matrix.getEntry(0, 0) * matrix.getEntry(2, 2);
        System.out.println("Product of diagonal entries: " + product);
    }
}