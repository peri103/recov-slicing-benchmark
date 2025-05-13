import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sparse real vector using MatrixUtils
        double[] data = {1.0, 0.0, 3.0}; // Example data
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);
        
        // Read the sparse real vector using MatrixUtils (assuming a method exists)
        /* read */ RealVector readVector = vector; // Directly using the vector created
        
        // Print the vector to verify
        System.out.println(readVector);
    }
}