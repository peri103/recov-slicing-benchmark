import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize data for the vector
        double[] data = {1.0, 2.0, 3.0};

        // Create a RealVector using MatrixUtils
        /* write */ RealVector vector = MatrixUtils.createRealVector(data);

        // Retrieve the RealVector
        /* read */ RealVector retrievedVector = vector;

        // Print the elements of the retrieved vector
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println(retrievedVector.getEntry(i));
        }
    }
}