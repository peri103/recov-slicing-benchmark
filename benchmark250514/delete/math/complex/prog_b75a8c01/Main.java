import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse real vector with initial data
        double[] data = {1.0, 2.0, 3.0};
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);

        // Create a dense matrix and perform operations
        double[][] matrixData = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);

        // Perform matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);

        // Print the result of the matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication: " + resultVector);

        // Create another vector for addition
        double[] data2 = {4.0, 5.0, 6.0};
        RealVector vector2 = MatrixUtils.createSparseRealVector(data2);

        // Add two vectors
        RealVector sumVector = vector.add(vector2);

        // Print the sum of the vectors
        System.out.println("Sum of vectors: " + sumVector);

        // Read the sparse real vector
        /* read */ RealVector readVector = vector;

        // Print the original vector to verify
        System.out.println("Original Vector: " + readVector);

        // Perform some additional operations on the read vector
        double norm = readVector.getNorm();
        System.out.println("Norm of the original vector: " + norm);
    }
}