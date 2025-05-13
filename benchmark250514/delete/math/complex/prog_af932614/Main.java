import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize an array with some values
        double[] values = {1.0, 2.0, 3.0};

        // Create a RealVector using MatrixUtils
        /* write */ RealVector vector = MatrixUtils.createRealVector(values);

        // Perform some operations on the vector
        RealVector scaledVector = vector.mapMultiply(2.0); // Scale the vector
        RealVector addedVector = scaledVector.add(vector); // Add the original vector to the scaled one

        // Create a RealMatrix using MatrixUtils
        double[][] matrixValues = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixValues);

        // Perform matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);

        // Retrieve the RealVector using MatrixUtils
        /* read */ RealVector retrievedVector = MatrixUtils.getRealVector(vector.toArray());

        // Print the retrieved values to ensure it matches the original
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println("Retrieved Vector Entry " + i + ": " + retrievedVector.getEntry(i));
        }

        // Print the result of matrix-vector multiplication
        System.out.println("Matrix-Vector Multiplication Result:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println("Result Vector Entry " + i + ": " + resultVector.getEntry(i));
        }

        // Additional operations for complexity
        double norm = vector.getNorm(); // Calculate the norm of the original vector
        double dotProduct = vector.dotProduct(scaledVector); // Calculate dot product

        // Print additional results
        System.out.println("Norm of Original Vector: " + norm);
        System.out.println("Dot Product with Scaled Vector: " + dotProduct);
    }
}