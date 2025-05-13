import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a BlockRealMatrix with dimensions 2x2
        BlockRealMatrix matrix = new BlockRealMatrix(2, 2);

        // Initialize another BlockRealMatrix for complex operations
        BlockRealMatrix matrix2 = new BlockRealMatrix(2, 2);

        // Initialize a RealVector
        RealVector vector = new ArrayRealVector(2);

        // Set entries in the vector
        vector.setEntry(0, 3.3);
        vector.setEntry(1, 4.4);

        // Perform some operations on matrix2
        matrix2.setEntry(0, 0, 10.0);
        matrix2.setEntry(0, 1, 20.0);
        matrix2.setEntry(1, 0, 30.0);
        matrix2.setEntry(1, 1, 40.0);

        // Perform matrix-vector multiplication
        RealVector result = matrix2.operate(vector);

        // Print the result of the multiplication
        System.out.println("Result of matrix-vector multiplication: " + result);

        // Write a value to the matrix at position (0, 0)
        /* write */ matrix.setEntry(0, 0, 5.5);

        // Perform some operations on the original matrix
        matrix.setEntry(0, 1, 6.6);
        matrix.setEntry(1, 0, 7.7);
        matrix.setEntry(1, 1, 8.8);

        // Calculate the determinant of matrix2
        double determinant = matrix2.getDeterminant();
        System.out.println("Determinant of matrix2: " + determinant);

        // Read the value from the matrix at position (0, 0)
        /* read */ double value = matrix.getEntry(0, 0);

        // Print the read value
        System.out.println("Read value: " + value);

        // Perform additional operations
        double trace = matrix.getTrace();
        System.out.println("Trace of matrix: " + trace);

        // Add matrices
        BlockRealMatrix sumMatrix = matrix.add(matrix2);
        System.out.println("Sum of matrices: " + sumMatrix);
    }
}