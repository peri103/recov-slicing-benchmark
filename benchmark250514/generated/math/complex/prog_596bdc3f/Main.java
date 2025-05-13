import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize an array of doubles to be used for creating the RealVector
        double[] data = { 1.0, 2.0, 3.0 };

        // Create a RealVector using the createRealVector method
        /* write */ RealVector vector = MatrixUtils.createRealVector(data);

        // Perform some operations with another RealVector
        double[] data2 = { 4.0, 5.0, 6.0 };
        RealVector vector2 = MatrixUtils.createRealVector(data2);
        RealVector sumVector = vector.add(vector2);
        System.out.println("Sum of vectors: " + sumVector);

        // Create a RealMatrix for additional complexity
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);

        // Perform matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);
        System.out.println("Result of matrix-vector multiplication: " + resultVector);

        // Utilize some other vector operations
        double norm = vector.getNorm();
        System.out.println("Norm of the original vector: " + norm);

        // Retrieve the first entry of the original vector
        /* read */ double value = vector.getEntry(0);

        // Print the first entry of the vector
        System.out.println("First entry of the original vector: " + value);

        // Perform dot product with another vector
        double dotProduct = vector.dotProduct(vector2);
        System.out.println("Dot product with another vector: " + dotProduct);

        // Scale the vector and print it
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled vector: " + scaledVector);
    }
}