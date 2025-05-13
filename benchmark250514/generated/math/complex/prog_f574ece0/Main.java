import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RealVector vector = new ArrayRealVector(3);
        RealVector vector2 = new ArrayRealVector(3);
        Random random = new Random();

        // Initialize vector2 with random values
        for (int i = 0; i < vector2.getDimension(); i++) {
            vector2.setEntry(i, random.nextDouble() * 10);
        }

        // Perform some operations on vector2
        double sum = 0;
        for (int i = 0; i < vector2.getDimension(); i++) {
            sum += vector2.getEntry(i);
        }
        System.out.println("Sum of vector2 entries: " + sum);

        // Set a value in vector
        /* write */ vector.setEntry(0, 5.0);

        // Perform some unrelated calculations
        double[] array = new double[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.pow(i, 2);
        }
        System.out.println("Squared array: " + Arrays.toString(array));

        // More operations on vector2
        vector2.mapMultiplyToSelf(2);
        System.out.println("Doubled vector2: " + vector2);

        // Read the value from vector
        /* read */ double value = vector.getEntry(0);
        System.out.println("Read value from vector: " + value);

        // Additional operations on vector
        vector.setEntry(1, 10.0);
        vector.setEntry(2, 15.0);
        System.out.println("Final vector: " + vector);
    }
}