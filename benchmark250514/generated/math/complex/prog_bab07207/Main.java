import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        RealVector vector = new ArrayRealVector(3);
        RealVector anotherVector = new ArrayRealVector(3);

        // Initialize anotherVector with some values
        anotherVector.setEntry(0, 10.0);
        anotherVector.setEntry(1, 20.0);
        anotherVector.setEntry(2, 30.0);

        // Perform some operations on anotherVector
        double sum = 0.0;
        for (int i = 0; i < anotherVector.getDimension(); i++) {
            sum += anotherVector.getEntry(i);
        }
        System.out.println("Sum of anotherVector: " + sum);

        // Perform some more operations
        RealVector scaledVector = anotherVector.mapMultiply(0.5);
        System.out.println("Scaled anotherVector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.println(scaledVector.getEntry(i));
        }

        /* write */ vector.setEntry(0, 42.0);
        
        // Additional unrelated computations
        double product = 1.0;
        for (int i = 0; i < anotherVector.getDimension(); i++) {
            product *= anotherVector.getEntry(i);
        }
        System.out.println("Product of anotherVector: " + product);

        // More vector operations
        RealVector combinedVector = vector.add(anotherVector);
        System.out.println("Combined vector:");
        for (int i = 0; i < combinedVector.getDimension(); i++) {
            System.out.println(combinedVector.getEntry(i));
        }

        // Final read operation
        /* read */ double value = vector.getEntry(0);
        System.out.println("Read value from vector: " + value);
    }
}