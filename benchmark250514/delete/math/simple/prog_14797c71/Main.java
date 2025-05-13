import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the vector with some data
        double[] data = {1.0, 2.0, 3.0};

        // Create an OpenMapRealVector using the write method
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(data);

        // Read the vector using the read method
        /* read */ OpenMapRealVector readVector = vector; // Since there's no getOpenMapRealVector method, just use the vector directly

        // Accessing an element to verify
        double value = readVector.getEntry(0);
        System.out.println(value);
    }
}