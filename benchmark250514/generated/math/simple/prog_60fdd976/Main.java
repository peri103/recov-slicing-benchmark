import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a double array to create a RealVector
        double[] data = {1.0, 2.0, 3.0};

        // Use MatrixUtils to create a RealVector
        /* write */ RealVector vector = MatrixUtils.createRealVector(data);

        // Read the RealVector back using the same reference
        /* read */ RealVector readVector = vector; // Since there's no getRealVector method, we use the vector directly

        // Print the first element to verify
        System.out.println(readVector.getEntry(0));
    }
}