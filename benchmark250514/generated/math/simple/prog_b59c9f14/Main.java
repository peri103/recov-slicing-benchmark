import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize an array to create a RealVector
        double[] data = {1.0, 2.0, 3.0};

        // Use MatrixUtils to create a RealVector
        /* write */ RealVector vector = MatrixUtils.createRealVector(data);

        // Read the RealVector using the same instance
        /* read */ RealVector readVector = vector;

        // Output the read vector to verify
        System.out.println(readVector);
    }
}