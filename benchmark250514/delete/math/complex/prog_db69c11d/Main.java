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

        // Create a column vector using the write method
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{7.0, 8.0});
        /* write */ matrix.setColumnVector(0, columnVector);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);

        // Create another matrix and perform operations
        double[][] anotherMatrixData = {
            {10.0, 11.0, 12.0},
            {13.0, 14.0, 15.0}
        };
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherMatrixData);
        RealMatrix addedMatrix = matrix.add(anotherMatrix);

        // Read the column vector using the read method
        /* read */ RealVector readVector = matrix.getColumnVector(0);

        // Print the read vector
        System.out.println("Read Vector: " + readVector);

        // Print the results of operations
        System.out.println("Transposed Matrix: " + transposedMatrix);
        System.out.println("Multiplied Matrix: " + multipliedMatrix);
        System.out.println("Added Matrix: " + addedMatrix);

        // Perform additional operations
        RealVector rowVector = matrix.getRowVector(1);
        System.out.println("Row Vector: " + rowVector);

        double[][] identityData = {
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        };
        RealMatrix identityMatrix = new Array2DRowRealMatrix(identityData);
        RealMatrix subtractedMatrix = addedMatrix.subtract(identityMatrix);
        System.out.println("Subtracted Matrix: " + subtractedMatrix);
    }
}