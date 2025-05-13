import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the OpenMapRealVector
        OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(5);
        
        // Write a value to the vector
        /* write */ vector.setEntry(0, 3.14);
        
        // Read the value from the vector
        /* read */ double value = vector.getEntry(0);
        
        // Print the value
        System.out.println(value);
    }
}