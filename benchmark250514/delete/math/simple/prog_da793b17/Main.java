import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a vector using the write method
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(5);

        // Set some values in the vector
        vector.setEntry(0, 1.0);
        vector.setEntry(1, 2.0);
        vector.setEntry(2, 3.0);
        vector.setEntry(3, 4.0);
        vector.setEntry(4, 5.0);

        // Read the vector using the read method
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);

        // Print the values to verify
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println(readVector.getEntry(i));
        }
    }
}