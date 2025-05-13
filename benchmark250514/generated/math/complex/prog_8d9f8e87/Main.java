import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a RealVector object using ArrayRealVector, a concrete implementation of RealVector
        RealVector vector = new ArrayRealVector(3); // Create a vector of size 3

        // Initialize another RealVector and a RealMatrix
        RealVector anotherVector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });

        // Perform some operations on the matrix and vector
        RealVector resultVector = matrix.operate(anotherVector);
        System.out.println("Result of matrix-vector multiplication: " + resultVector);

        // Some complex calculations
        RealVector scaledVector = anotherVector.mapMultiply(2.0);
        System.out.println("Scaled vector: " + scaledVector);

        /* write */ 
        vector.setEntry(0, 3.14); // Set the value at index 0 to 3.14

        // More operations with vectors
        RealVector sumVector = vector.add(anotherVector);
        System.out.println("Sum of vectors: " + sumVector);

        // Insert a loop with some operations
        for (int i = 0; i < vector.getDimension(); i++) {
            vector.setEntry(i, i * 2.0);
        }

        // Print intermediate results
        System.out.println("Updated vector: " + vector);

        /* read */ 
        double value = vector.getEntry(0); // Retrieve the value at index 0

        System.out.println("Read value: " + value); // Print the value to verify it's correctly read

        // Additional operations
        RealVector combinedVector = resultVector.add(scaledVector);
        System.out.println("Combined vector: " + combinedVector);
    }
}