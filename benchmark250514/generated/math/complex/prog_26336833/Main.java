import org.apache.commons.math3.linear.SparseRealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a SparseRealMatrix
        SparseRealMatrix matrix = new OpenMapRealMatrix(3, 3);

        // Perform some unrelated operations
        RealMatrix denseMatrix = MatrixUtils.createRealMatrix(3, 3);
        denseMatrix.setEntry(0, 0, 1.1);
        denseMatrix.setEntry(1, 1, 2.2);
        denseMatrix.setEntry(2, 2, 3.3);

        // Another matrix operation
        RealMatrix resultMatrix = denseMatrix.scalarMultiply(2.0);
        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Set an entry in the SparseRealMatrix
        /* write */ matrix.setEntry(1, 1, 5.5);

        // Additional operations on the SparseRealMatrix
        matrix.setEntry(0, 0, 4.4);
        matrix.setEntry(2, 2, 6.6);

        // Perform some calculations
        double sum = matrix.getEntry(0, 0) + matrix.getEntry(2, 2);
        System.out.println("Sum of diagonal entries: " + sum);

        // Retrieve the value from the SparseRealMatrix
        /* read */ double value = matrix.getEntry(1, 1);
        System.out.println("Retrieved value: " + value);

        // More complex operations
        SparseRealMatrix anotherMatrix = new OpenMapRealMatrix(3, 3);
        anotherMatrix.setEntry(0, 1, 7.7);
        anotherMatrix.setEntry(1, 0, 8.8);

        RealMatrix addedMatrix = matrix.add(anotherMatrix);
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}