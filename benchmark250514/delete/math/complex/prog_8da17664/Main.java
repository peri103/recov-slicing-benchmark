import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the vector with a size of 5
        OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(5);
        
        // Set a value at index 0
        vector.setEntry(0, 3.14);
        
        // Perform some additional operations
        vector.setEntry(1, 2.71);
        vector.setEntry(2, 1.41);
        
        // Create another vector and perform operations
        OpenMapRealVector vector2 = MatrixUtils.createOpenMapRealVector(5);
        vector2.setEntry(0, 1.0);
        vector2.setEntry(1, 2.0);
        vector2.setEntry(2, 3.0);
        
        // Add vector2 to the original vector
        vector = vector.add(vector2);
        
        // Perform a scalar multiplication
        vector = (OpenMapRealVector) vector.mapMultiply(2.0);
        
        // Calculate the dot product
        double dotProduct = vector.dotProduct(vector2);
        System.out.println("Dot product: " + dotProduct);
        
        // Calculate the norm of the vector
        double norm = vector.getNorm();
        System.out.println("Norm: " + norm);
        
        // Read the value from index 0
        /* read */ double value = vector.getEntry(0);
        
        // Output the value
        System.out.println("Value at index 0: " + value);
        
        // Output the entire vector
        for (int i = 0; i < vector.getDimension(); i++) {
            System.out.println("Index " + i + ": " + vector.getEntry(i));
        }
    }
}