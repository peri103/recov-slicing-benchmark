import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize an array to create a RealVector
        double[] data = {1.0, 2.0, 3.0};

        // Use MatrixUtils to create a RealVector
        /* write */ RealVector vector = MatrixUtils.createRealVector(data);

        // Perform some operations with matrices
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);

        // Multiply the vector with the matrix
        RealVector resultVector = matrix.operate(vector);

        // Print the result of the matrix operation
        System.out.println("Result of matrix-vector multiplication:");
        System.out.println(resultVector);

        // Perform some additional calculations
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled vector:");
        System.out.println(scaledVector);

        // More unrelated operations
        double[] additionalData = {4.0, 5.0, 6.0};
        RealVector anotherVector = MatrixUtils.createRealVector(additionalData);
        RealVector sumVector = vector.add(anotherVector);
        System.out.println("Sum of vectors:");
        System.out.println(sumVector);

        // Read the RealVector using the same instance
        /* read */ RealVector readVector = vector;

        // Output the read vector to verify
        System.out.println("Original vector:");
        System.out.println(readVector);
    }
}