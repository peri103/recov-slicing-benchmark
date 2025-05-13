import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create a 3x3 matrix
        RealMatrix matrix = new Array2DRowRealMatrix(3, 3);

        // Create a vector
        RealVector vector = new ArrayRealVector(3);

        // Initialize matrix with random values
        Random random = new Random();
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                matrix.setEntry(i, j, random.nextDouble() * 10);
            }
        }

        // Set a specific value in the matrix
        /* write */ matrix.setEntry(1, 1, 5.5);

        // Perform matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);

        // Calculate sum of all matrix entries
        double sum = 0.0;
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                sum += matrix.getEntry(i, j);
            }
        }

        // Read the specific value from the matrix
        /* read */ double value = matrix.getEntry(1, 1);

        // Print the value read from the matrix
        System.out.println("Value at (1,1): " + value);

        // Print the sum of all matrix entries
        System.out.println("Sum of matrix entries: " + sum);

        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
    }
}