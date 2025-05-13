import org.apache.commons.math3.linear.SymmetricMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix with size 3x3
        SymmetricMatrix matrix = new SymmetricMatrix(3);

        // Initialize another matrix for additional operations
        RealMatrix additionalMatrix = MatrixUtils.createRealMatrix(3, 3);

        // Fill the additional matrix with some values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                additionalMatrix.setEntry(i, j, i + j);
            }
        }

        // Perform some operations on the additional matrix
        RealMatrix transposedMatrix = additionalMatrix.transpose();
        RealMatrix multipliedMatrix = additionalMatrix.multiply(transposedMatrix);

        // Write a value to the symmetric matrix
        /* write */ matrix.setEntry(1, 1, 5.0);

        // Print the multiplied matrix values
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform some unrelated calculations
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += Math.sqrt(i);
        }
        System.out.println("Sum of square roots: " + sum);

        // Read the value from the symmetric matrix
        /* read */ double value = matrix.getEntry(1, 1);

        // Print the value
        System.out.println("Value from symmetric matrix: " + value);
    }
}