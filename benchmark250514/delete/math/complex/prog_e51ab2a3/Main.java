import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an OpenMapRealVector using MatrixUtils
        OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(3);

        // Write values to the vector
        /* write */ vector.setEntry(0, 1.0);
        vector.setEntry(1, 2.0);
        vector.setEntry(2, 3.0);

        // Perform some unrelated operations with ArrayRealVector
        ArrayRealVector arrayVector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        arrayVector.mapAddToSelf(1.0);
        System.out.println("ArrayRealVector after adding 1.0 to each element:");
        for (int i = 0; i < arrayVector.getDimension(); i++) {
            System.out.println("Value at index " + i + ": " + arrayVector.getEntry(i));
        }

        // Further operations on OpenMapRealVector
        vector.mapMultiplyToSelf(2.0);
        System.out.println("OpenMapRealVector after multiplying each element by 2.0:");
        for (int i = 0; i < vector.getDimension(); i++) {
            System.out.println("Value at index " + i + ": " + vector.getEntry(i));
        }

        // Read values from the vector
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);

        // Print the values to ensure they are read correctly
        System.out.println("Read OpenMapRealVector values:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println("Value at index " + i + ": " + readVector.getEntry(i));
        }

        // Additional operation on readVector
        readVector.mapSubtractToSelf(1.0);
        System.out.println("Read OpenMapRealVector after subtracting 1.0 from each element:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println("Value at index " + i + ": " + readVector.getEntry(i));
        }
    }
}