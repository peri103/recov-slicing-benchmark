import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        RealMatrix matrix = new Array2DRowRealMatrix(3, 3);
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(3, 3);

        // Initialize the matrices with some values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                anotherMatrix.setEntry(i, j, i + j);
            }
        }

        // Perform some operations on the matrices
        RealMatrix resultMatrix = anotherMatrix.scalarMultiply(2.0);

        // More complex operations
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double value = resultMatrix.getEntry(i, j) + 1.5;
                matrix.setEntry(i, j, value); // Using the same write method
            }
        }

        // Original write operation
        /* write */ matrix.setEntry(0, 0, 2.5);

        // Perform some unrelated calculations
        double sum = 0.0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += matrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of all matrix entries: " + sum);

        // Some more operations
        RealMatrix transposedMatrix = matrix.transpose();

        // Original read operation
        /* read */ double value = matrix.getEntry(0, 0);
        System.out.println("Value at (0, 0): " + value);

        // Display the transposed matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}