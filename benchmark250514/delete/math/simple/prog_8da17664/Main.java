import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the vector with a size of 5
        OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(5);
        
        // Set a value at index 0
        vector.setEntry(0, 3.14);
        
        // Read the value from index 0
        /* read */ double value = vector.getEntry(0);
        
        // Output the value
        System.out.println(value);
    }
}