import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a diagonal matrix with size 3
        DiagonalMatrix matrix = new DiagonalMatrix(3);

        // Initialize another diagonal matrix with different values
        DiagonalMatrix matrix2 = new DiagonalMatrix(new double[]{1.0, 2.0, 3.0});

        // Perform some operations on matrix2
        RealMatrix multipliedMatrix = matrix2.scalarMultiply(2.0);
        RealMatrix transposedMatrix = matrix2.transpose();

        // Write a value into the first matrix
        /* write */ matrix.setEntry(1, 5.0);

        // Perform some operations on the first matrix
        RealMatrix addedMatrix = matrix.add(matrix2);
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix resultMatrix = addedMatrix.multiply(identityMatrix);

        // More complex operations with another matrix
        DiagonalMatrix matrix3 = new DiagonalMatrix(new double[]{4.0, 5.0, 6.0});
        RealMatrix combinedMatrix = resultMatrix.add(matrix3);

        // Read the value from the first matrix
        /* read */ double value = matrix.getEntry(1);

        // Print the value to ensure the read method works correctly
        System.out.println("Read value: " + value);

        // Print some results from the operations
        System.out.println("Combined Matrix:");
        for (int i = 0; i < combinedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < combinedMatrix.getColumnDimension(); j++) {
                System.out.print(combinedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}