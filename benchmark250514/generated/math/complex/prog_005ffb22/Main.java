import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        OpenMapRealVector vector = new OpenMapRealVector(10);
        ArrayRealVector arrayVector = new ArrayRealVector(10);
        
        // Initialize arrayVector with some values
        for (int i = 0; i < 10; i++) {
            arrayVector.setEntry(i, i * 1.5);
        }

        // Perform some operations on arrayVector
        for (int i = 0; i < 10; i++) {
            double val = arrayVector.getEntry(i);
            System.out.println("ArrayRealVector Entry " + i + ": " + val);
        }

        // Set a value in OpenMapRealVector
        /* write */ vector.setEntry(0, 5.0);

        // Perform some unrelated calculations
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arrayVector.getEntry(i);
        }
        System.out.println("Sum of ArrayRealVector entries: " + sum);

        // Perform some operations on OpenMapRealVector
        for (int i = 1; i < 5; i++) {
            vector.setEntry(i, i * 2.0);
        }

        // Retrieve the value from OpenMapRealVector
        /* read */ double value = vector.getEntry(0);
        System.out.println("OpenMapRealVector Entry 0: " + value);

        // Perform more operations on OpenMapRealVector
        for (int i = 0; i < 5; i++) {
            double val = vector.getEntry(i);
            System.out.println("OpenMapRealVector Entry " + i + ": " + val);
        }
    }
}