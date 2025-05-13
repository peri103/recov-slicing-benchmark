import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize the vector with a size of 3
        OpenMapRealVector vector = new OpenMapRealVector(3);
        
        // Write a value to the vector at index 0
        vector.setEntry(0, 1.0);
        /* write */ MatrixUtils.createOpenMapRealVector(vector);

        // Read the value from the vector at index 0
        OpenMapRealVector readVector = /* read */ MatrixUtils.getOpenMapRealVector(vector);
        double value = readVector.getEntry(0);
        
        // Print the value
        System.out.println(value);
    }
}