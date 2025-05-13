import org.apache.commons.math3.linear.SymmetricMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 symmetric matrix
        SymmetricMatrix matrix = new SymmetricMatrix(3);

        // Initialize a 3x3 regular matrix
        RealMatrix regularMatrix = MatrixUtils.createRealMatrix(3, 3);

        // Set an entry in the symmetric matrix
        /* write */ matrix.setEntry(1, 2, 5.0);

        // Fill the regular matrix with values
        for (int i = 0; i < regularMatrix.getRowDimension(); i++) {
            for (int j = 0; j < regularMatrix.getColumnDimension(); j++) {
                regularMatrix.setEntry(i, j, i + j);
            }
        }

        // Perform matrix multiplication with the regular matrix
        RealMatrix resultMatrix = regularMatrix.multiply(regularMatrix);

        // Print the result matrix
        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Calculate the trace of the regular matrix
        double trace = 0;
        for (int i = 0; i < regularMatrix.getRowDimension(); i++) {
            trace += regularMatrix.getEntry(i, i);
        }
        System.out.println("Trace of Regular Matrix: " + trace);

        // Read the entry from the symmetric matrix
        /* read */ double value = matrix.getEntry(1, 2);

        // Print the value to verify
        System.out.println("Symmetric Matrix Entry (1, 2): " + value);

        // Perform some additional operations on the symmetric matrix
        double diagonalSum = 0;
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            diagonalSum += matrix.getEntry(i, i);
        }
        System.out.println("Diagonal Sum of Symmetric Matrix: " + diagonalSum);
    }
}