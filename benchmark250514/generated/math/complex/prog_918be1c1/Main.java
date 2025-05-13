import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3);

        // Fill the matrix with some initial values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix.setEntry(i, j, i * 3 + j);
            }
        }

        // Perform some operations on the matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix resultMatrix = matrix.multiply(identityMatrix);

        // Print the result of the multiplication
        System.out.println("Result of multiplying with identity matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Modify an entry in the matrix
        /* write */ matrix.setEntry(1, 1, 5.0);

        // Perform another operation
        RealMatrix transposedMatrix = matrix.transpose();

        // Print the transposed matrix
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the modified entry
        /* read */ double value = matrix.getEntry(1, 1);
        System.out.println("Value at (1,1): " + value);

        // Additional computation
        double sum = 0;
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                sum += matrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of all elements in the matrix: " + sum);
    }
}