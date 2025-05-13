import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row
        double[][] data = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a row vector using the write method
        /* write */ RealVector rowVector = MatrixUtils.createRowRealVector(data[0]);

        // Set the row vector into the matrix
        matrix.setRowVector(0, rowVector);

        // Create another matrix with more complex data
        double[][] complexData = {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        };
        RealMatrix complexMatrix = new Array2DRowRealMatrix(complexData);

        // Perform some operations on the complex matrix
        RealMatrix transposedMatrix = complexMatrix.transpose();
        RealMatrix multipliedMatrix = complexMatrix.multiply(transposedMatrix);

        // Print the transposed and multiplied matrices
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the row vector using the read method
        /* read */ RealVector readVector = matrix.getRowVector(0);

        // Print the read vector
        System.out.println("Read Vector: " + readVector);
    }
}