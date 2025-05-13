import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a new OpenMapRealVector with specified size
        OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(3);
        
        // Initialize vector with some values
        vector.setEntry(0, 1.0);
        vector.setEntry(1, 2.0);
        vector.setEntry(2, 3.0);
        
        // Write operation: createOpenMapRealVector
        /* write */ OpenMapRealVector writeVector = MatrixUtils.createOpenMapRealVector(vector.getDimension());
        writeVector.setSubVector(0, vector);
        
        // Read operation: getOpenMapRealVector
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(writeVector);
        
        // Display the values in the read vector
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println("Value at index " + i + ": " + readVector.getEntry(i));
        }
    }
}