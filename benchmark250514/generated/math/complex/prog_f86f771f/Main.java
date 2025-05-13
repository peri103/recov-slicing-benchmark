import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix
        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 3);

        // Initialize a vector and set some values
        RealVector vector = new ArrayRealVector(3);
        vector.setEntry(0, 1.0);
        vector.setEntry(1, 2.0);
        vector.setEntry(2, 3.0);

        // Perform matrix operations
        matrix.setRowVector(0, vector);

        // Set a value in the matrix
        /* write */ matrix.setEntry(1, 1, 5.5);

        // Initialize another matrix and perform operations
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(3, 3);
        matrix2.setEntry(0, 0, 10.0);
        matrix2.setEntry(1, 1, 20.0);
        matrix2.setEntry(2, 2, 30.0);

        // Multiply two matrices
        RealMatrix resultMatrix = matrix.multiply(matrix2);

        // Calculate the determinant of the result matrix
        double determinant = new org.apache.commons.math3.linear.LUDecomposition(resultMatrix).getDeterminant();
        System.out.println("Determinant: " + determinant);

        // Read the value from the matrix
        /* read */ double value = matrix.getEntry(1, 1);

        // Print the value
        System.out.println("Read value: " + value);

        // Print the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform vector operations
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}