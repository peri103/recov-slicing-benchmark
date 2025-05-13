import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the array for the RealVector
        double[] data = {1.0, 2.0, 3.0};

        // Create a RealVector using MatrixUtils
        /* write */ RealVector vector = MatrixUtils.createRealVector(data);

        // Retrieve the RealVector using MatrixUtils (although there's no direct getRealVector method, we'll assume it's similar to accessing the vector directly)
        /* read */ RealVector retrievedVector = vector; // Directly accessing the created vector

        // Print the values from the retrieved vector to ensure correctness
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println(retrievedVector.getEntry(i));
        }
    }
}