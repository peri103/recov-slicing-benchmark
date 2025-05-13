import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a RealVector object using ArrayRealVector, a concrete implementation of RealVector
        RealVector vector = new ArrayRealVector(1); // Create a vector of size 1

        /* write */ 
        vector.setEntry(0, 3.14); // Set the value at index 0 to 3.14

        /* read */ 
        double value = vector.getEntry(0); // Retrieve the value at index 0

        System.out.println(value); // Print the value to verify it's correctly read
    }
}