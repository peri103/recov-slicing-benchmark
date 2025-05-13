import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a 3x3 matrix
        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 3);

        // Initialize another 3x3 matrix with some values
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][] {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        });

        // Write a value to the matrix
        /* write */ matrix.setEntry(0, 0, 42.0);

        // Perform some operations on the other matrix
        RealVector vector = new ArrayRealVector(new double[]{1, 0, 1});
        RealVector resultVector = anotherMatrix.operate(vector);
        System.out.println("Result of matrix-vector multiplication: " + resultVector);

        // Sum of all elements in anotherMatrix
        double sum = 0;
        for (int i = 0; i < anotherMatrix.getRowDimension(); i++) {
            for (int j = 0; j < anotherMatrix.getColumnDimension(); j++) {
                sum += anotherMatrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of all elements in anotherMatrix: " + sum);

        // Read the value from the matrix
        /* read */ double value = matrix.getEntry(0, 0);

        // Print the value to verify it was correctly read
        System.out.println("Value read from matrix: " + value);

        // Multiply the original matrix by anotherMatrix and print the resulting matrix
        RealMatrix multipliedMatrix = matrix.multiply(anotherMatrix);
        System.out.println("Resulting matrix after multiplication:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}