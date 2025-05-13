import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a sparse real vector using MatrixUtils
        double[] data = {1.0, 2.0, 3.0}; // Example data for the vector
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);

        // Perform some operations on a dense vector
        double[] denseData = {4.0, 5.0, 6.0};
        RealVector denseVector = new ArrayRealVector(denseData);
        double dotProduct = vector.dotProduct(denseVector);
        System.out.println("Dot product of sparse and dense vectors: " + dotProduct);

        // Create a matrix and perform operations
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);
        RealVector resultVector = matrix.operate(denseVector);
        System.out.println("Result of matrix-vector multiplication: " + resultVector);

        // More operations with the original sparse vector
        RealVector addedVector = vector.add(denseVector);
        System.out.println("Addition of sparse and dense vectors: " + addedVector);

        // Retrieve the sparse real vector using MatrixUtils
        /* read */ RealVector retrievedVector = MatrixUtils.getSparseRealVector(vector);

        // Print the retrieved vector to verify the operation
        System.out.println("Retrieved sparse vector: " + retrievedVector);
    }
}