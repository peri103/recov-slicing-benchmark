import org.apache.commons.math3.linear.SparseRealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        SparseRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        RealMatrix denseMatrix = MatrixUtils.createRealMatrix(3, 3);

        // Initialize some entries in the dense matrix
        denseMatrix.setEntry(0, 0, 2.0);
        denseMatrix.setEntry(1, 2, 3.0);
        denseMatrix.setEntry(2, 1, 4.0);

        // Perform some operations on the dense matrix
        RealMatrix transposedMatrix = denseMatrix.transpose();
        RealMatrix resultMatrix = denseMatrix.multiply(transposedMatrix);

        // Print the result matrix
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* write */ matrix.setEntry(1, 1, 5.0);

        // Perform some additional operations on the sparse matrix
        matrix.setEntry(0, 2, 1.5);
        matrix.setEntry(2, 0, 2.5);

        // Calculate the sum of all entries in the sparse matrix
        double sum = 0.0;
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                sum += matrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of all entries in the sparse matrix: " + sum);

        /* read */ double value = matrix.getEntry(1, 1);
        System.out.println("Value at (1, 1): " + value);

        // Additional logic to find the maximum value in the sparse matrix
        double maxValue = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                double currentValue = matrix.getEntry(i, j);
                if (currentValue > maxValue) {
                    maxValue = currentValue;
                }
            }
        }
        System.out.println("Maximum value in the sparse matrix: " + maxValue);
    }
}