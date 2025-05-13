import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to represent a matrix
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };

        // Create a RealMatrix from the 2D array
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a new vector using the write method
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{10.0, 11.0, 12.0});

        // Perform some unrelated operations to make the program more complex
        RealVector rowVector = matrix.getRowVector(0);
        double sum = 0;
        for (int i = 0; i < rowVector.getDimension(); i++) {
            sum += rowVector.getEntry(i);
        }
        System.out.println("Sum of elements in the first row: " + sum);

        // Update the matrix with the new column vector at column index 1
        matrix.setColumnVector(1, columnVector);

        // Perform additional operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Use the read method to get the column real vector from the matrix at column index 1
        /* read */ RealVector readVector = matrix.getColumnVector(1);

        // Print the read vector to verify the value
        System.out.println("Column Vector at index 1: " + readVector);

        // Perform more operations on the matrix
        double[] scaleFactors = {2.0, 2.0, 2.0};
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}