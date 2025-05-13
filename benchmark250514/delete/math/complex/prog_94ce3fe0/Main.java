import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the OpenMapRealVector with some values
        double[] values = {1.0, 2.0, 3.0};
        
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(values);
        
        // Perform some operations on the vector
        vector.setEntry(1, 10.0); // Modify an entry in the vector
        vector.addToEntry(2, 5.0); // Add a value to an entry
        
        // Create another vector and perform operations
        RealVector anotherVector = new OpenMapRealVector(values);
        anotherVector.mapMultiplyToSelf(2.0); // Multiply each entry by 2
        
        // Combine vectors
        RealVector combinedVector = vector.add(anotherVector);
        
        // Print combined vector values
        for (int i = 0; i < combinedVector.getDimension(); i++) {
            System.out.println("Combined Vector Entry " + i + ": " + combinedVector.getEntry(i));
        }
        
        // Read the vector using the read method
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);
        
        // Print the values to verify
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println("Read Vector Entry " + i + ": " + readVector.getEntry(i));
        }
        
        // Perform additional operations on the read vector
        readVector.mapAddToSelf(2.0); // Add 2 to each entry
        System.out.println("After mapAddToSelf operation:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println("Read Vector Entry " + i + ": " + readVector.getEntry(i));
        }
    }
}