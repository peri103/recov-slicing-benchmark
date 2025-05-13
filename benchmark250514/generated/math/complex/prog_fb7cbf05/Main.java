import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.SparseRealVector;
import org.apache.commons.math3.linear.RealVector;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SparseRealVector vector = new OpenMapRealVector(10);
        SparseRealVector additionalVector = new OpenMapRealVector(10);
        Random random = new Random();

        // Initialize additionalVector with random values
        for (int i = 0; i < 10; i++) {
            additionalVector.setEntry(i, random.nextDouble() * 100);
        }

        // Perform some calculations on additionalVector
        RealVector scaledVector = additionalVector.mapMultiply(0.5);
        System.out.println("Scaled Vector: " + scaledVector);

        // Set a specific entry in vector
        /* write */ vector.setEntry(0, 5.0);

        // Do some operations with vector
        vector.setEntry(1, 10.0);
        vector.setEntry(2, 20.0);

        // Calculate the dot product with additionalVector
        double dotProduct = vector.dotProduct(additionalVector);
        System.out.println("Dot Product: " + dotProduct);

        // Perform some more operations
        RealVector sumVector = vector.add(scaledVector);
        System.out.println("Sum Vector: " + sumVector);

        // Get the value from the vector
        /* read */ double value = vector.getEntry(0);
        System.out.println("Value at index 0: " + value);

        // Further operations
        double norm = vector.getNorm();
        System.out.println("Norm of vector: " + norm);

        // Print all entries of the vector
        for (int i = 0; i < vector.getDimension(); i++) {
            System.out.println("Entry " + i + ": " + vector.getEntry(i));
        }
    }
}