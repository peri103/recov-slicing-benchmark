import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a BlockRealMatrix
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Use MatrixUtils to create a BlockRealMatrix
        /* write */ BlockRealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Perform some operations on the matrix
        RealVector vector = new ArrayRealVector(new double[]{5.0, 6.0});
        RealVector resultVector = matrix.operate(vector);

        // Print the result of the matrix-vector multiplication
        System.out.println("Matrix-vector multiplication result:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Create another matrix for addition
        double[][] data2 = {
            {1.0, 1.0},
            {1.0, 1.0}
        };
        BlockRealMatrix matrix2 = MatrixUtils.createBlockRealMatrix(data2);

        // Add the two matrices
        RealMatrix sumMatrix = matrix.add(matrix2);

        // Print the sum matrix
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Use MatrixUtils to retrieve the BlockRealMatrix
        /* read */ BlockRealMatrix retrievedMatrix = MatrixUtils.getBlockRealMatrix(matrix.getData());

        // Print the retrieved matrix to verify the result
        System.out.println("Retrieved Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}