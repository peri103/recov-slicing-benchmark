import org.apache.commons.math3.linear.SymmetricMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the symmetric matrix with a size of 3x3
        SymmetricMatrix matrix = new SymmetricMatrix(3);

        // Initialize another matrix to perform additional operations
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(3, 3);

        // Fill the additional matrix with some values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                additionalMatrix.setEntry(i, j, i + j);
            }
        }

        // Perform a matrix addition operation
        RealMatrix resultMatrix = additionalMatrix.add(additionalMatrix);

        // Write a value to the symmetric matrix at position (0, 1)
        /* write */ matrix.setEntry(0, 1, 5.0);

        // Perform some operations on the result matrix
        double sum = 0.0;
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                sum += resultMatrix.getEntry(i, j);
            }
        }

        // Print the sum of entries in the result matrix
        System.out.println("Sum of entries in result matrix: " + sum);

        // Read the value from the symmetric matrix at position (0, 1)
        /* read */ double value = matrix.getEntry(0, 1);

        // Print the value read from the symmetric matrix
        System.out.println("Value from symmetric matrix: " + value);

        // Perform additional operations on the symmetric matrix
        double diagonalSum = 0.0;
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            diagonalSum += matrix.getEntry(i, i);
        }

        // Print the sum of diagonal entries in the symmetric matrix
        System.out.println("Sum of diagonal entries in symmetric matrix: " + diagonalSum);
    }
}