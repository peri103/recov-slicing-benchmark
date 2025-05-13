import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a diagonal matrix with size 3
        DiagonalMatrix matrix = new DiagonalMatrix(3);

        // Set the value at the first diagonal position
        /* write */ matrix.setEntry(0, 5.0);

        // Initialize another matrix and perform operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix productMatrix = matrix.multiply(identityMatrix);

        // Perform some unrelated calculations
        double sum = 0;
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                sum += productMatrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of elements in productMatrix: " + sum);

        // Read the value from the first diagonal position
        /* read */ double value = matrix.getEntry(0);

        // Print the value to verify
        System.out.println("Diagonal value: " + value);

        // Perform additional matrix operations
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        System.out.println("Scaled matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}