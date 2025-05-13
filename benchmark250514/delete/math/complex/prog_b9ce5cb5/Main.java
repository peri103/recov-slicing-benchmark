import org.apache.commons.math3.linear.TriangularMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a TriangularMatrix with a size of 3 (for example)
        TriangularMatrix matrix = new TriangularMatrix(3);

        // Initialize another matrix for additional operations
        RealMatrix additionalMatrix = MatrixUtils.createRealMatrix(3, 3);

        // Perform some operations on the additional matrix
        additionalMatrix.setEntry(0, 0, 2.0);
        additionalMatrix.setEntry(1, 1, 3.0);
        additionalMatrix.setEntry(2, 2, 4.0);

        // Set an entry in the TriangularMatrix
        /* write */ matrix.setEntry(0, 0, 5.0);

        // Perform some matrix addition
        RealMatrix resultMatrix = additionalMatrix.add(matrix);

        // Display the result of matrix addition
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform some unrelated arithmetic operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Retrieve the entry from the TriangularMatrix
        /* read */ double value = matrix.getEntry(0, 0);

        // Print the value to verify
        System.out.println("Retrieved value from TriangularMatrix: " + value);
    }
}