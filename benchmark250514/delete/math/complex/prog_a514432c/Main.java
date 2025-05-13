import org.apache.commons.math3.linear.TriangularMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the TriangularMatrix with a size, for example, 3x3
        TriangularMatrix matrix = new TriangularMatrix(3);

        // Initialize another matrix for additional operations
        RealMatrix otherMatrix = MatrixUtils.createRealMatrix(3, 3);

        // Perform some operations on the other matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                otherMatrix.setEntry(i, j, i + j);
            }
        }

        // Write a value to the matrix at position (1, 1)
        /* write */ matrix.setEntry(1, 1, 5.0);

        // Perform more operations on the other matrix
        RealMatrix sumMatrix = otherMatrix.add(matrix);

        // Output the sum matrix to verify operations
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the value from the matrix at position (1, 1)
        /* read */ double value = matrix.getEntry(1, 1);

        // Output the read value to verify correctness
        System.out.println("Read value: " + value);

        // Perform additional unrelated operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix productMatrix = identityMatrix.multiply(otherMatrix);

        // Output the product matrix to verify operations
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                System.out.print(productMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}