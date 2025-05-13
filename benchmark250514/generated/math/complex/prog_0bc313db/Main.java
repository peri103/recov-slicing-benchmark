import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.SparseRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        SparseRealMatrix matrix = new OpenMapRealMatrix(3, 3); // Initialize a 3x3 sparse matrix
        RealMatrix denseMatrix = new OpenMapRealMatrix(3, 3); // Initialize another matrix for operations

        // Set some values in the denseMatrix
        denseMatrix.setEntry(0, 0, 1.1);
        denseMatrix.setEntry(0, 1, 2.2);
        denseMatrix.setEntry(0, 2, 3.3);

        /* write */ matrix.setEntry(1, 1, 5.5); // Set the value 5.5 at position (1, 1)

        // Perform some operations on denseMatrix
        denseMatrix.setEntry(1, 0, 4.4);
        denseMatrix.setEntry(1, 1, 5.5);
        denseMatrix.setEntry(1, 2, 6.6);

        // Add matrices
        RealMatrix resultMatrix = matrix.add(denseMatrix);

        // Print the result of adding matrices
        for (int row = 0; row < resultMatrix.getRowDimension(); row++) {
            for (int col = 0; col < resultMatrix.getColumnDimension(); col++) {
                System.out.print(resultMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Perform some unrelated calculations
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * 1.5;
        }
        System.out.println("Unrelated sum: " + sum);

        /* read */ double value = matrix.getEntry(1, 1); // Read the value at position (1, 1)
        System.out.println("Read value: " + value); // Output the value

        // More unrelated operations
        double product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Unrelated product: " + product);
    }
}