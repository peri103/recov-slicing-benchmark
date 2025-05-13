import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 diagonal matrix
        DiagonalMatrix matrix = new DiagonalMatrix(3);
        // Initialize a 3x3 regular matrix
        RealMatrix regularMatrix = new Array2DRowRealMatrix(3, 3);

        /* write */ matrix.setEntry(0, 1.5); // Set the first diagonal entry to 1.5

        // Perform operations on the regular matrix
        regularMatrix.setEntry(0, 0, 2.0);
        regularMatrix.setEntry(1, 1, 3.0);
        regularMatrix.setEntry(2, 2, 4.0);

        // Calculate the sum of diagonal elements
        double sumDiagonal = 0;
        for (int i = 0; i < 3; i++) {
            sumDiagonal += regularMatrix.getEntry(i, i);
        }

        // Multiply the regular matrix by a scalar
        RealMatrix scaledMatrix = regularMatrix.scalarMultiply(2.0);

        // Print the scaled matrix
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ double value = matrix.getEntry(0); // Read the first diagonal entry
        System.out.println("Diagonal Matrix Entry: " + value);

        // Calculate the trace of the regular matrix
        double trace = 0;
        for (int i = 0; i < regularMatrix.getRowDimension(); i++) {
            trace += regularMatrix.getEntry(i, i);
        }
        System.out.println("Trace of Regular Matrix: " + trace);
    }
}