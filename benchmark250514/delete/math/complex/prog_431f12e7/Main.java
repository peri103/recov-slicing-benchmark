import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SymmetricMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix with size 3x3 for demonstration
        RealMatrix baseMatrix = MatrixUtils.createRealMatrix(3, 3);
        SymmetricMatrix matrix = new SymmetricMatrix(baseMatrix);

        // Initialize another matrix for additional operations
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(3, 3);
        anotherMatrix.setEntry(0, 0, 1.0);
        anotherMatrix.setEntry(1, 1, 2.0);
        anotherMatrix.setEntry(2, 2, 3.0);

        // Perform some operations on the second matrix
        double sum = 0;
        for (int i = 0; i < anotherMatrix.getRowDimension(); i++) {
            for (int j = 0; j < anotherMatrix.getColumnDimension(); j++) {
                sum += anotherMatrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of anotherMatrix entries: " + sum);

        // Set an entry in the symmetric matrix
        /* write */ matrix.setEntry(1, 1, 5.0);

        // Perform some unrelated operations
        double trace = 0;
        for (int i = 0; i < anotherMatrix.getRowDimension(); i++) {
            trace += anotherMatrix.getEntry(i, i);
        }
        System.out.println("Trace of anotherMatrix: " + trace);

        // More complex operations on matrices
        RealMatrix resultMatrix = anotherMatrix.multiply(anotherMatrix);
        System.out.println("Result of multiplying anotherMatrix by itself:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Get the entry from the symmetric matrix
        /* read */ double value = matrix.getEntry(1, 1);

        // Print the value to verify correctness
        System.out.println("Value from symmetric matrix: " + value);
    }
}