import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a block real matrix
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Use the write method to create a block real matrix
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(new double[] {5.0, 6.0});
        RealVector resultVector = matrix.operate(vector);
        System.out.println("Resulting Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform matrix addition with another matrix
        RealMatrix anotherMatrix = MatrixUtils.createBlockRealMatrix(new double[][] {
            {7.0, 8.0},
            {9.0, 10.0}
        });
        RealMatrix sumMatrix = matrix.add(anotherMatrix);
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Use the read method to get the block real matrix
        /* read */ RealMatrix readMatrix = matrix;

        // Print the matrix to verify the read value
        System.out.println("Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform matrix multiplication
        RealMatrix multipliedMatrix = matrix.multiply(anotherMatrix);
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}