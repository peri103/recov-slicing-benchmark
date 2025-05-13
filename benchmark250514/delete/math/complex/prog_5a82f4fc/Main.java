import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the vector with some values
        double[] values = {1.0, 2.0, 3.0};

        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(values);

        // Perform some operations on the vector
        vector.setEntry(0, 5.0); // Modify the first entry
        vector.addToEntry(1, 2.0); // Add to the second entry
        System.out.println("Modified vector entries:");
        for (int i = 0; i < vector.getDimension(); i++) {
            System.out.println(vector.getEntry(i));
        }

        // Create another vector using ArrayRealVector
        RealVector anotherVector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector sumVector = vector.add(anotherVector); // Add vectors

        System.out.println("Sum of vectors:");
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.println(sumVector.getEntry(i));
        }

        // Perform dot product
        double dotProduct = vector.dotProduct(anotherVector);
        System.out.println("Dot product: " + dotProduct);

        // Perform subtraction
        RealVector diffVector = vector.subtract(anotherVector);
        System.out.println("Difference of vectors:");
        for (int i = 0; i < diffVector.getDimension(); i++) {
            System.out.println(diffVector.getEntry(i));
        }

        // Scale the vector
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.println(scaledVector.getEntry(i));
        }

        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);

        // Print the values of the read vector to verify correctness
        System.out.println("Read vector entries:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println(readVector.getEntry(i));
        }
    }
}