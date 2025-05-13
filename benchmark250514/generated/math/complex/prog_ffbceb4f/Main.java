import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize an array of doubles to create a RealVector
        double[] data = {1.0, 2.0, 3.0};

        /* write */ RealVector vector = MatrixUtils.createRealVector(data);

        // Create a matrix for some additional operations
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);

        // Perform matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);

        // Print the result of the multiplication
        System.out.println("Result of matrix-vector multiplication: " + resultVector);

        // Perform some operations on the vector
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled vector: " + scaledVector);

        // Calculate the norm of the vector
        double norm = vector.getNorm();
        System.out.println("Norm of the vector: " + norm);

        // Add a constant to each element of the vector
        RealVector shiftedVector = vector.mapAdd(5.0);
        System.out.println("Shifted vector: " + shiftedVector);

        // Retrieve the original vector for verification
        /* read */ RealVector readVector = vector; // Since MatrixUtils does not have a getRealVector method, we use the created vector directly

        // Print the vector to verify
        System.out.println("Original Vector: " + readVector);
    }
}