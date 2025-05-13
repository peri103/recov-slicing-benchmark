import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize an array of doubles to be used for creating the RealVector
        double[] data = { 1.0, 2.0, 3.0 };

        // Create a RealVector using the createRealVector method
        /* write */ RealVector vector = MatrixUtils.createRealVector(data);

        // Retrieve the RealVector using the getRealVector method
        // Since MatrixUtils does not have a getRealVector method, we will use the vector object directly
        /* read */ double value = vector.getEntry(0);

        // Print the first entry of the vector
        System.out.println(value);
    }
}