import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize an OpenMapRealVector object
        OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(5);
        
        // Initialize another RealVector using ArrayRealVector
        RealVector arrayVector = new ArrayRealVector(5);
        
        // Populate arrayVector with some values
        for (int i = 0; i < 5; i++) {
            arrayVector.setEntry(i, i * 2.0);
        }
        
        // Transfer some values from arrayVector to vector
        for (int i = 0; i < 5; i++) {
            vector.setEntry(i, arrayVector.getEntry(i));
        }
        
        // Perform some calculations on vector
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += vector.getEntry(i);
        }
        
        // Print the sum of vector entries
        System.out.println("Sum of vector entries: " + sum);
        
        // Write a value into the vector at a specific index
        vector.setEntry(0, 1.0);  // Set the value at index 0 to 1.0
        
        // Perform more operations on arrayVector
        RealVector scaledVector = arrayVector.mapMultiply(3.0);
        
        // Print scaled vector entries
        System.out.println("Scaled vector entries:");
        for (int i = 0; i < 5; i++) {
            System.out.println(scaledVector.getEntry(i));
        }
        
        // Read the value from the vector at the same index
        /* read */ double value = vector.getEntry(0);
        
        // Print the read value
        System.out.println("Read value: " + value);
        
        // Perform some operations on the original vector
        RealVector addedVector = vector.add(scaledVector);
        
        // Print added vector entries
        System.out.println("Added vector entries:");
        for (int i = 0; i < 5; i++) {
            System.out.println(addedVector.getEntry(i));
        }
    }
}