import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a matrix
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };

        // Create a matrix from the 2D array
        RealMatrix matrix = new Array2DRowRealMatrix(data);

        // Create a column real vector using the write method
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{10.0, 11.0, 12.0});

        // Set the first column of the matrix to the created column vector
        matrix.setColumnVector(0, columnVector);

        // Perform some matrix operations
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the column vector back using the read method
        /* read */ RealVector readColumnVector = matrix.getColumnVector(0);

        // Print the read column vector
        System.out.println("Read Column Vector: " + readColumnVector);

        // Additional operations with another matrix
        double[][] anotherData = {
            {2.0, 0.0, 1.0},
            {3.0, 5.0, 4.0},
            {1.0, 1.0, 1.0}
        };
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherData);
        RealMatrix sumMatrix = matrix.add(anotherMatrix);

        // Print the sum of the matrices
        System.out.println("Sum of Matrices:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}