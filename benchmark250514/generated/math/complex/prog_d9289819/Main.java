import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a BlockRealMatrix with dimensions 3x3
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3);

        // Initialize another BlockRealMatrix with dimensions 3x3
        BlockRealMatrix matrix2 = new BlockRealMatrix(3, 3);

        // Write a value into the matrix at position (1,1)
        /* write */ matrix.setEntry(1, 1, 42.0);

        // Fill the second matrix with some values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2.setEntry(i, j, i * j + 0.5);
            }
        }

        // Perform some operations on matrix2
        RealMatrix resultMatrix = matrix2.scalarMultiply(2.0);

        // Output the resultMatrix to check the operations
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform more operations on the original matrix
        matrix.addToEntry(0, 0, 10.0);
        matrix.multiplyEntry(2, 2, 3.0);

        // Read the value from the matrix at position (1,1)
        /* read */ double value = matrix.getEntry(1, 1);

        // Output the value to ensure correctness
        System.out.println("Read value: " + value);

        // Perform further operations and print the matrix
        matrix.setEntry(0, 2, 5.0);
        matrix.setEntry(2, 0, 7.0);

        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}