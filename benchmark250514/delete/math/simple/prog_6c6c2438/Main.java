import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Define a dimension for the vector
        int dimension = 5;
        
        // Create an OpenMapRealVector using MatrixUtils
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(dimension);
        
        // Set some values in the vector
        vector.setEntry(0, 1.0);
        vector.setEntry(1, 2.0);
        vector.setEntry(2, 3.0);
        
        // Retrieve the OpenMapRealVector using MatrixUtils
        /* read */ OpenMapRealVector retrievedVector = MatrixUtils.getOpenMapRealVector(vector);
        
        // Print out the values to verify
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println("Entry at index " + i + ": " + retrievedVector.getEntry(i));
        }
    }
}