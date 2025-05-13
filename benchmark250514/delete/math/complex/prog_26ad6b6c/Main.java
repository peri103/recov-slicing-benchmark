import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Define a 2D array to initialize the matrix
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Use MatrixUtils to create a BlockRealMatrix
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealVector columnVector = matrix.getColumnVector(0);

        // Create another matrix to perform operations
        double[][] data2 = {
            {5.0, 6.0},
            {7.0, 8.0}
        };
        RealMatrix matrix2 = MatrixUtils.createBlockRealMatrix(data2);
        RealMatrix multipliedMatrix = matrix.multiply(matrix2);

        // Use MatrixUtils to retrieve the BlockRealMatrix
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getBlockRealMatrix(matrix.getData(), 0, 0, 2, 2);

        // Print the retrieved matrix to verify the read operation
        System.out.println("Retrieved Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print the column vector
        System.out.println("Column Vector:");
        for (int i = 0; i < columnVector.getDimension(); i++) {
            System.out.print(columnVector.getEntry(i) + " ");
        }
        System.out.println();

        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}