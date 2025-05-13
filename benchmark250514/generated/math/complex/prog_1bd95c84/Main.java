import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3);

        // Write value to the matrix
        /* write */ matrix.setEntry(1, 1, 42.0);

        // Initialize another 3x3 matrix with default values
        BlockRealMatrix matrix2 = new BlockRealMatrix(3, 3);
        matrix2.setEntry(0, 0, 1.0);
        matrix2.setEntry(0, 1, 2.0);
        matrix2.setEntry(0, 2, 3.0);
        matrix2.setEntry(1, 0, 4.0);
        matrix2.setEntry(1, 1, 5.0);
        matrix2.setEntry(1, 2, 6.0);
        matrix2.setEntry(2, 0, 7.0);
        matrix2.setEntry(2, 1, 8.0);
        matrix2.setEntry(2, 2, 9.0);

        // Perform matrix addition
        RealMatrix resultMatrix = matrix.add(matrix2);

        // Print the resulting matrix
        System.out.println("Resulting Matrix after Addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform matrix multiplication
        RealMatrix multipliedMatrix = matrix.multiply(matrix2);

        // Print the resulting matrix from multiplication
        System.out.println("Resulting Matrix after Multiplication:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read value from the matrix
        /* read */ double value = matrix.getEntry(1, 1);

        // Output the value
        System.out.println("Read value: " + value);

        // Create an identity matrix and perform operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix addedIdentity = resultMatrix.add(identityMatrix);

        // Print the resulting matrix from adding identity
        System.out.println("Resulting Matrix after Adding Identity Matrix:");
        for (int i = 0; i < addedIdentity.getRowDimension(); i++) {
            for (int j = 0; j < addedIdentity.getColumnDimension(); j++) {
                System.out.print(addedIdentity.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}