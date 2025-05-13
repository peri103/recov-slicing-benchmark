import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create a vector with initial size and default value
        OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(5);

        // Set a value to the vector
        vector.setEntry(0, 1.0); // Writing value 1.0 at index 0

        /* write */ MatrixUtils.createOpenMapRealVector(5).setEntry(0, 1.0);

        // Add some unrelated complex operations
        OpenMapRealVector anotherVector = new OpenMapRealVector(5);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            anotherVector.setEntry(i, random.nextDouble() * 100);
        }

        RealVector sumVector = vector.add(anotherVector);
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.println("Sum vector entry " + i + ": " + sumVector.getEntry(i));
        }

        // Perform some mathematical operations
        RealVector scaledVector = sumVector.mapMultiply(2.0);
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.println("Scaled vector entry " + i + ": " + scaledVector.getEntry(i));
        }

        // Read the value from the original vector
        double value = /* read */ vector.getEntry(0);
        
        System.out.println("Original vector entry 0: " + value);

        // Further operations on vectors
        OpenMapRealVector differenceVector = anotherVector.subtract(vector);
        for (int i = 0; i < differenceVector.getDimension(); i++) {
            System.out.println("Difference vector entry " + i + ": " + differenceVector.getEntry(i));
        }
    }
}