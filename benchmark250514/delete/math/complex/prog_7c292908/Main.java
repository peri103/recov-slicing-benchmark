import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create an OpenMapRealVector instance using MatrixUtils
        OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(3);
        
        // Write a value to the vector
        /* write */ vector.setEntry(0, 1.0);
        
        // Create another vector using ArrayRealVector for demonstration
        RealVector arrayVector = new ArrayRealVector(3);
        arrayVector.setEntry(1, 2.5);
        arrayVector.setEntry(2, 3.5);
        
        // Perform some operations on the arrayVector
        double sum = arrayVector.getEntry(1) + arrayVector.getEntry(2);
        System.out.println("Sum of entries in arrayVector: " + sum);
        
        // Modify the original vector with some operations
        vector.setEntry(1, vector.getEntry(0) * 2);
        vector.setEntry(2, vector.getEntry(1) + 2);
        
        // Display the modified vector
        System.out.println("Modified vector:");
        for (int i = 0; i < vector.getDimension(); i++) {
            System.out.println("Entry " + i + ": " + vector.getEntry(i));
        }
        
        // Read the value from the original vector
        /* read */ double value = vector.getEntry(0);
        
        System.out.println("Read value from vector: " + value);
        
        // Additional operations to increase complexity
        RealVector scaledVector = vector.mapMultiply(1.5);
        System.out.println("Scaled vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.println("Entry " + i + ": " + scaledVector.getEntry(i));
        }
        
        // Create a zero vector and add it to the original vector
        RealVector zeroVector = new ArrayRealVector(3);
        RealVector addedVector = vector.add(zeroVector);
        
        System.out.println("Added vector:");
        for (int i = 0; i < addedVector.getDimension(); i++) {
            System.out.println("Entry " + i + ": " + addedVector.getEntry(i));
        }
    }
}