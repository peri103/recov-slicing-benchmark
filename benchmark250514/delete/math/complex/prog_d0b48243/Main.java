import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array of doubles for the matrix
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Create a BlockRealMatrix using the MatrixUtils class
        /* write */ BlockRealMatrix matrix = (BlockRealMatrix) MatrixUtils.createBlockRealMatrix(data);

        // Perform some operations on the matrix
        RealMatrix matrixTransposed = matrix.transpose();
        RealVector vector = new ArrayRealVector(new double[] {5.0, 6.0});
        RealVector resultVector = matrixTransposed.operate(vector);

        // Print the result of the vector operation
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Initialize another 2D array of doubles for a different matrix
        double[][] data2 = {
            {7.0, 8.0},
            {9.0, 10.0}
        };

        // Create another BlockRealMatrix using the MatrixUtils class
        BlockRealMatrix anotherMatrix = (BlockRealMatrix) MatrixUtils.createBlockRealMatrix(data2);

        // Add the two matrices
        RealMatrix sumMatrix = matrix.add(anotherMatrix);

        // Print the sum matrix
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Retrieve the BlockRealMatrix using the MatrixUtils class
        /* read */ BlockRealMatrix retrievedMatrix = (BlockRealMatrix) MatrixUtils.getBlockRealMatrix(matrix.getData());

        // Print the retrieved matrix
        System.out.println("Retrieved Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}