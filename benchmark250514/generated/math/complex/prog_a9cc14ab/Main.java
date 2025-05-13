import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3);

        // Initialize another matrix and perform operations
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(3, 3);
        anotherMatrix.setEntry(0, 1, 3.0);
        anotherMatrix.setEntry(1, 0, 2.0);
        anotherMatrix.setEntry(2, 2, 4.0);

        // Perform matrix addition
        RealMatrix resultMatrix = matrix.add(anotherMatrix);

        // Print the result of matrix addition
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Set an entry in the original matrix
        /* write */ matrix.setEntry(0, 0, 5.0);

        // Perform matrix multiplication
        RealMatrix multipliedMatrix = matrix.multiply(anotherMatrix);

        // Print the result of matrix multiplication
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Get an entry from the original matrix
        /* read */ double value = matrix.getEntry(0, 0);
        System.out.println("Value at (0, 0): " + value);

        // Perform transpose operation
        RealMatrix transposedMatrix = matrix.transpose();

        // Print the transposed matrix
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}