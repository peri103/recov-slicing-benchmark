import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix with zero values
        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 3);

        // Create a row vector with values
        double[] rowValues = {1.0, 2.0, 3.0};

        // Write the row vector to the first row of the matrix
        /* write */ matrix.setRowVector(0, MatrixUtils.createRowRealVector(rowValues));

        // Additional operations on the matrix
        double[][] data = {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        };
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(data);

        // Add matrices
        RealMatrix resultMatrix = matrix.add(anotherMatrix);
        System.out.println("Resulting Matrix after addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform scalar multiplication
        RealMatrix scaledMatrix = resultMatrix.scalarMultiply(2.0);
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the row vector from the first row of the matrix
        /* read */ RealVector rowVector = matrix.getRowVector(0);

        // Print the values of the row vector
        System.out.println("Row Vector: " + rowVector);

        // Calculate the norm of the row vector
        double norm = rowVector.getNorm();
        System.out.println("Norm of the Row Vector: " + norm);

        // Create another vector and perform addition
        RealVector anotherVector = MatrixUtils.createRealVector(new double[]{3.0, 3.0, 3.0});
        RealVector addedVector = rowVector.add(anotherVector);
        System.out.println("Added Vector: " + addedVector);
    }
}