import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a 3x3 matrix
        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 3);

        // Write a value to the matrix
        /* write */ matrix.setEntry(1, 1, 5.0);

        // Create a vector and fill it with values
        RealVector vector = new ArrayRealVector(3);
        vector.setEntry(0, 1.0);
        vector.setEntry(1, 2.0);
        vector.setEntry(2, 3.0);

        // Perform a matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);

        // Print the result of the multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Modify another entry in the matrix
        matrix.setEntry(0, 2, 3.5);

        // Perform a matrix addition
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(3, 3);
        anotherMatrix.setEntry(0, 0, 1.0);
        anotherMatrix.setEntry(1, 1, 2.0);
        anotherMatrix.setEntry(2, 2, 3.0);

        RealMatrix sumMatrix = matrix.add(anotherMatrix);

        // Print the sum matrix
        System.out.println("Sum of matrices:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the value from the matrix
        /* read */ double value = matrix.getEntry(1, 1);
        
        // Print the value to verify
        System.out.println("Value at (1, 1): " + value);
    }
}