import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize an array with some values
        double[] values = {1.0, 2.0, 3.0};

        // Create a RealVector using MatrixUtils
        /* write */ RealVector vector = MatrixUtils.createRealVector(values);

        // Retrieve the RealVector using MatrixUtils
        /* read */ RealVector retrievedVector = MatrixUtils.getRealVector(vector.toArray());

        // Print the retrieved values to ensure it matches the original
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println(retrievedVector.getEntry(i));
        }
    }
}