import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an OpenMapRealVector instance
        OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(3);
        
        // Set values in the vector
        vector.setEntry(0, 1.0);
        vector.setEntry(1, 2.0);
        vector.setEntry(2, 3.0);
        
        // Retrieve the OpenMapRealVector instance using MatrixUtils
        /* read */ OpenMapRealVector retrievedVector = MatrixUtils.getOpenMapRealVector(vector);
        
        // Print the values to verify
        System.out.println(retrievedVector.getEntry(0));
        System.out.println(retrievedVector.getEntry(1));
        System.out.println(retrievedVector.getEntry(2));
    }
}