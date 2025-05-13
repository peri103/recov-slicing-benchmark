import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a double array to use with createRealVector
        double[] data = {1.0, 2.0, 3.0};

        // Create a RealVector using the write method
        /* write */ RealVector vector = MatrixUtils.createRealVector(data);

        // Read the RealVector using the read method
        /* read */ RealVector readVector = vector; // As there is no getRealVector method in MatrixUtils, we directly use the vector

        // Print the read vector to verify
        System.out.println(readVector);
    }
}