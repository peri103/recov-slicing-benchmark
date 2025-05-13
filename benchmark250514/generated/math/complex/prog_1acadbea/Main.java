import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix with zeros
        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 3);

        // Write a value to the matrix at position (0, 0)
        /* write */ matrix.setEntry(0, 0, 5.0);

        // Initialize another matrix and perform operations
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(3, 3);
        matrix2.setEntry(1, 1, 10.0);
        matrix2.setEntry(2, 2, 15.0);

        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(3);
        vector.setEntry(0, 2.0);
        vector.setEntry(1, 3.0);
        vector.setEntry(2, 4.0);

        // Multiply matrix with vector
        RealVector resultVector = matrix2.operate(vector);
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Perform matrix addition
        RealMatrix matrixSum = matrix.add(matrix2);
        System.out.println("Matrix after addition:");
        for (int row = 0; row < matrixSum.getRowDimension(); row++) {
            for (int col = 0; col < matrixSum.getColumnDimension(); col++) {
                System.out.print(matrixSum.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Read the value from the matrix at position (0, 0)
        /* read */ double value = matrix.getEntry(0, 0);

        // Print the value
        System.out.println("Read value: " + value);

        // Perform matrix subtraction
        RealMatrix matrixDifference = matrix2.subtract(matrix);
        System.out.println("Matrix after subtraction:");
        for (int row = 0; row < matrixDifference.getRowDimension(); row++) {
            for (int col = 0; col < matrixDifference.getColumnDimension(); col++) {
                System.out.print(matrixDifference.getEntry(row, col) + " ");
            }
            System.out.println();
        }
    }
}