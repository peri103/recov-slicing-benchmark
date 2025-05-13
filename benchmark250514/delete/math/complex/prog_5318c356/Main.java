import org.apache.commons.math3.linear.TriangularMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 triangular matrix
        TriangularMatrix matrix = new TriangularMatrix(3);

        // Initialize another matrix for additional operations
        RealMatrix additionalMatrix = MatrixUtils.createRealMatrix(3, 3);

        // Set some entries in the additional matrix
        additionalMatrix.setEntry(0, 1, 2.0);
        additionalMatrix.setEntry(1, 2, 3.0);

        // Perform some operations on the additional matrix
        double sum = 0.0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += additionalMatrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of additional matrix entries: " + sum);

        /* write */ matrix.setEntry(0, 0, 5.0); // Set the value at position (0,0)

        // Perform more operations before reading the value
        double diagonalSum = 0.0;
        for (int i = 0; i < 3; i++) {
            diagonalSum += matrix.getEntry(i, i);
        }
        System.out.println("Sum of diagonal entries: " + diagonalSum);

        // Use another matrix for demonstration
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(3, 3);
        anotherMatrix.setEntry(0, 0, 1.0);
        anotherMatrix.setEntry(1, 1, 4.0);
        anotherMatrix.setEntry(2, 2, 9.0);

        // Calculate the product of the diagonal elements
        double product = 1.0;
        for (int i = 0; i < 3; i++) {
            product *= anotherMatrix.getEntry(i, i);
        }
        System.out.println("Product of diagonal entries in another matrix: " + product);

        /* read */ double value = matrix.getEntry(0, 0); // Read the value at position (0,0)

        System.out.println("Value from triangular matrix: " + value);
    }
}