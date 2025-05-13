import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a matrix
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };

        // Create a RealMatrix from the 2D array
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a RealVector using createRowRealVector method from MatrixUtils
        double[] rowData = {7.0, 8.0, 9.0};
        /* write */ RealVector vector = MatrixUtils.createRowRealVector(rowData);

        // Perform some unrelated operations on the matrix
        RealMatrix multipliedMatrix = matrix.scalarMultiply(2.0);
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            System.out.println(multipliedMatrix.getRowVector(i));
        }

        // Set the vector as a row in the matrix
        matrix.setRowVector(1, vector);

        // Perform more unrelated operations
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            System.out.println(transposedMatrix.getRowVector(i));
        }

        // Read the vector from the matrix using getRowVector method
        /* read */ RealVector readVector = matrix.getRowVector(1);

        // Print the read vector
        System.out.println("Read Vector:");
        System.out.println(readVector);

        // Additional operations with another matrix
        double[][] anotherMatrixData = {
            {10.0, 11.0, 12.0},
            {13.0, 14.0, 15.0}
        };
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherMatrixData);
        RealMatrix addedMatrix = matrix.add(anotherMatrix);
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            System.out.println(addedMatrix.getRowVector(i));
        }
    }
}