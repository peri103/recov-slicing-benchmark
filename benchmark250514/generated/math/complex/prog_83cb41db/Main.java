import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a BlockRealMatrix with 3 rows and 3 columns
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3);

        // Write the value 5.0 to the position (1, 1) in the matrix
        /* write */ matrix.setEntry(1, 1, 5.0);

        // Additional operations to increase complexity
        // Initialize another matrix and perform some operations
        BlockRealMatrix anotherMatrix = new BlockRealMatrix(3, 3);
        anotherMatrix.setEntry(0, 0, 1.0);
        anotherMatrix.setEntry(0, 1, 2.0);
        anotherMatrix.setEntry(0, 2, 3.0);
        anotherMatrix.setEntry(1, 0, 4.0);
        anotherMatrix.setEntry(1, 1, 5.0);
        anotherMatrix.setEntry(1, 2, 6.0);
        anotherMatrix.setEntry(2, 0, 7.0);
        anotherMatrix.setEntry(2, 1, 8.0);
        anotherMatrix.setEntry(2, 2, 9.0);

        // Perform matrix addition
        RealMatrix sumMatrix = matrix.add(anotherMatrix);

        // Print the resulting matrix
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform matrix multiplication
        RealMatrix productMatrix = matrix.multiply(anotherMatrix);

        // Print the resulting matrix
        System.out.println("Product Matrix:");
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                System.out.print(productMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the value from the position (1, 1) in the matrix
        /* read */ double value = matrix.getEntry(1, 1);

        // Print the value to verify the read operation
        System.out.println("Value read from matrix: " + value);

        // Create an identity matrix and perform some operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);

        // Subtract identity matrix from anotherMatrix
        RealMatrix resultMatrix = anotherMatrix.subtract(identityMatrix);

        // Print the resulting matrix
        System.out.println("Result Matrix after subtraction:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}