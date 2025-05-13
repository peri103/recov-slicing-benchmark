import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sparse real vector using MatrixUtils
        double[] data = {1.0, 0.0, 3.0, 0.0, 5.0};
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);
        
        // Retrieve the sparse real vector using MatrixUtils
        /* read */ RealVector retrievedVector = vector; // Directly using the created vector as there is no specific get method in MatrixUtils
        
        // Print the retrieved vector
        System.out.println("Retrieved Vector: " + retrievedVector);
    }
}