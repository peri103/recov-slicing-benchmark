import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the vector with some values
        double[] values = {1.0, 2.0, 3.0};

        // Create an OpenMapRealVector using the MatrixUtils class
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(values);

        // Retrieve the OpenMapRealVector using the MatrixUtils class
        /* read */ OpenMapRealVector retrievedVector = MatrixUtils.getOpenMapRealVector(vector);

        // Print the values of the retrieved vector to verify
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println(retrievedVector.getEntry(i));
        }
    }
}