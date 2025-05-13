import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sparse real vector with initial data
        double[] data = {1.0, 2.0, 3.0};
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);

        // Read the sparse real vector
        /* read */ RealVector readVector = vector;

        // Print the vector to verify
        System.out.println("Vector: " + readVector);
    }
}