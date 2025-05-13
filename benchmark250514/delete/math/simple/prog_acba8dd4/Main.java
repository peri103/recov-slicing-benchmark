import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sparse real vector using MatrixUtils
        double[] data = {1.0, 2.0, 3.0};
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);

        // Retrieve the sparse real vector using MatrixUtils
        /* read */ RealVector retrievedVector = vector; // Since there's no direct method 'getSparseRealVector', we assume retrieval is direct

        // Output the vector to ensure it was correctly written and read
        System.out.println("Vector: " + retrievedVector);
    }
}