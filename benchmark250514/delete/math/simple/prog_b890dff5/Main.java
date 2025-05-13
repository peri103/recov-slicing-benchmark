import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize an OpenMapRealVector object
        OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(5);
        
        // Write a value into the vector at a specific index
        vector.setEntry(0, 1.0);  // Set the value at index 0 to 1.0
        
        // Read the value from the vector at the same index
        /* read */ double value = vector.getEntry(0);
        
        // Print the read value
        System.out.println(value);
    }
}