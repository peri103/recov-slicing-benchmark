import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a 3x3 matrix
        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 3);

        // Write a value to the matrix at position (1, 1)
        /* write */ matrix.setEntry(1, 1, 5.0);

        // Additional matrix operations
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(3, 3);
        anotherMatrix.setEntry(0, 0, 2.0);
        anotherMatrix.setEntry(0, 1, 3.0);
        anotherMatrix.setEntry(0, 2, 4.0);
        anotherMatrix.setEntry(1, 0, 1.0);
        anotherMatrix.setEntry(1, 1, 1.0);
        anotherMatrix.setEntry(1, 2, 1.0);
        anotherMatrix.setEntry(2, 0, 7.0);
        anotherMatrix.setEntry(2, 1, 8.0);
        anotherMatrix.setEntry(2, 2, 9.0);

        // Perform matrix addition
        RealMatrix sumMatrix = matrix.add(anotherMatrix);

        // Print the sum matrix
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform scalar multiplication
        RealMatrix scaledMatrix = anotherMatrix.scalarMultiply(2.0);

        // Print the scaled matrix
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the value from the matrix at position (1, 1)
        /* read */ double value = matrix.getEntry(1, 1);

        // Print the read value
        System.out.println("Read Value: " + value);
    }
}