import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an OpenMapRealVector using the MatrixUtils class
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(5);
        
        // Set a value in the vector to ensure there is something to read
        vector.setEntry(0, 1.0);
        
        // Read the OpenMapRealVector using the MatrixUtils class
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);
        
        // Print the value to verify the read operation
        System.out.println(readVector.getEntry(0));
    }
}