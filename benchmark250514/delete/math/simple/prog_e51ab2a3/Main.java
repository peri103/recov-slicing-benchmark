import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an OpenMapRealVector using MatrixUtils
        OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(3);
        
        // Write values to the vector
        /* write */ vector.setEntry(0, 1.0);
        vector.setEntry(1, 2.0);
        vector.setEntry(2, 3.0);
        
        // Read values from the vector
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);
        
        // Print the values to ensure they are read correctly
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println("Value at index " + i + ": " + readVector.getEntry(i));
        }
    }
}