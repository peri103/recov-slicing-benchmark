import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2x2 matrix
        Array2DRowRealMatrix matrix = new Array2DRowRealMatrix(2, 2);

        // Write a value to the matrix at position (0, 0)
        /* write */ matrix.setEntry(0, 0, 5.0);

        // Perform some operations on another matrix
        Array2DRowRealMatrix anotherMatrix = new Array2DRowRealMatrix(2, 2);
        anotherMatrix.setEntry(0, 1, 3.0);
        anotherMatrix.setEntry(1, 0, 7.0);
        anotherMatrix.setEntry(1, 1, 2.0);

        // Multiply the matrices
        RealMatrix resultMatrix = matrix.multiply(anotherMatrix);
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Create an identity matrix for testing
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(2);
        System.out.println("Identity Matrix:");
        for (int i = 0; i < identityMatrix.getRowDimension(); i++) {
            for (int j = 0; j < identityMatrix.getColumnDimension(); j++) {
                System.out.print(identityMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the value from the matrix at position (0, 0)
        /* read */ double value = matrix.getEntry(0, 0);

        // Print the read value
        System.out.println("Read value from matrix: " + value);

        // Perform some additional calculations
        double determinant = anotherMatrix.getDeterminant();
        System.out.println("Determinant of anotherMatrix: " + determinant);

        // Transpose anotherMatrix and print it
        RealMatrix transposedMatrix = anotherMatrix.transpose();
        System.out.println("Transposed anotherMatrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}