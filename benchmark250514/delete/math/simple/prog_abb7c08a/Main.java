import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a vector with some values
        double[] values = {1.0, 2.0, 3.0};
        
        // Use the write method to create an OpenMapRealVector
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(values);
        
        // Use the read method to retrieve the OpenMapRealVector
        /* read */ OpenMapRealVector retrievedVector = MatrixUtils.getOpenMapRealVector(vector);
        
        // Print the retrieved vector to ensure the correct value is read
        System.out.println(retrievedVector);
    }
}