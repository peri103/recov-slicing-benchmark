import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an OpenMapRealVector using the write method
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(new double[]{1.0, 2.0, 3.0});

        // Read the OpenMapRealVector using the read method
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);

        // Print the vector to verify the correct value is read
        System.out.println(readVector);
    }
}