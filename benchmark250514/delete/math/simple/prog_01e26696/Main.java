import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a real vector with some data
        double[] data = {1.0, 2.0, 3.0};

        // Use the write method to create an OpenMapRealVector
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(data);

        // Use the read method to retrieve the OpenMapRealVector
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);

        // Output the values in the vector to verify correctness
        System.out.println("Vector values:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println(readVector.getEntry(i));
        }
    }
}