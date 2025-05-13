import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a sparse real vector using MatrixUtils
        double[] data = {1.0, 2.0, 3.0}; // Example data for the vector
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);

        // Retrieve the sparse real vector using MatrixUtils
        /* read */ RealVector retrievedVector = MatrixUtils.getSparseRealVector(vector);

        // Print the retrieved vector to verify the operation
        System.out.println(retrievedVector);
    }
}