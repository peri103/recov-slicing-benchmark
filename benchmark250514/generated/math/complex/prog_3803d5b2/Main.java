import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.SparseRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a SparseRealMatrix instance
        SparseRealMatrix matrix = new OpenMapRealMatrix(3, 3);

        // Initialize another matrix with some values
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][] {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        });

        // Write a value into the matrix
        /* write */ matrix.setEntry(0, 0, 5.0);

        // Perform some operations with another matrix
        RealMatrix resultMatrix = anotherMatrix.multiply(matrix);
        System.out.println("Result of multiplication:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Add another entry to the matrix
        matrix.setEntry(1, 1, 10.0);

        // Perform some operations with the matrix
        double trace = matrix.getTrace();
        System.out.println("Trace of the matrix: " + trace);

        // Read the value from the matrix
        /* read */ double value = matrix.getEntry(0, 0);

        // Print the value to verify
        System.out.println("Value at (0, 0): " + value);

        // Perform a sum operation on the matrix
        double sum = 0.0;
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                sum += matrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of all entries in the matrix: " + sum);
    }
}