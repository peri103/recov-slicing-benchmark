import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        OpenMapRealVector vector = new OpenMapRealVector(10);
        ArrayRealVector arrayVector = new ArrayRealVector(5);
        HashMap<Integer, Double> map = new HashMap<>();

        // Performing operations on arrayVector
        for (int i = 0; i < arrayVector.getDimension(); i++) {
            arrayVector.setEntry(i, i * 2.0);
        }

        // Storing values in a HashMap
        for (int i = 0; i < arrayVector.getDimension(); i++) {
            map.put(i, arrayVector.getEntry(i));
        }

        // Performing some calculations
        double sum = 0;
        for (int i = 0; i < arrayVector.getDimension(); i++) {
            sum += map.get(i);
        }

        // Output the sum
        System.out.println("Sum of arrayVector entries: " + sum);

        // Original write operation
        /* write */ vector.setEntry(0, 5.5);

        // More complex operations involving vector
        for (int i = 1; i < vector.getDimension(); i++) {
            vector.setEntry(i, vector.getEntry(i - 1) + 1.1);
        }

        // Read from vector after some unrelated operations
        /* read */ double value = vector.getEntry(0);
        System.out.println("Value from vector: " + value);

        // Output the entire vector
        for (int i = 0; i < vector.getDimension(); i++) {
            System.out.println("Entry " + i + ": " + vector.getEntry(i));
        }
    }
}