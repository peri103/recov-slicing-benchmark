import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an OpenMapRealVector instance using MatrixUtils
        OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(3);
        
        // Write a value to the vector
        /* write */ vector.setEntry(0, 1.0);
        
        // Read the value from the vector
        /* read */ double value = vector.getEntry(0);
        
        System.out.println(value);
    }
}