import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Create a vector with initial size and default value
        OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(5);

        // Set a value to the vector
        vector.setEntry(0, 1.0); // Writing value 1.0 at index 0

        /* write */ MatrixUtils.createOpenMapRealVector(5).setEntry(0, 1.0);

        // Read the value from the vector
        double value = /* read */ vector.getEntry(0);
        
        System.out.println(value);
    }
}