import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Define a dimension for the vector
        int dimension = 5;

        // Create an OpenMapRealVector using MatrixUtils
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(dimension);

        // Set some values in the vector
        vector.setEntry(0, 1.0);
        vector.setEntry(1, 2.0);
        vector.setEntry(2, 3.0);

        // Perform some additional operations
        ArrayRealVector arrayVector = new ArrayRealVector(dimension);
        for (int i = 0; i < dimension; i++) {
            arrayVector.setEntry(i, i * 1.5);
        }

        // Add the array vector to the open map vector
        RealVector combinedVector = vector.add(arrayVector);

        // Print out the combined vector
        System.out.println("Combined Vector:");
        for (int i = 0; i < combinedVector.getDimension(); i++) {
            System.out.println("Entry at index " + i + ": " + combinedVector.getEntry(i));
        }

        // Retrieve the OpenMapRealVector using MatrixUtils
        /* read */ OpenMapRealVector retrievedVector = MatrixUtils.getOpenMapRealVector(vector);

        // Print out the values to verify
        System.out.println("Retrieved Vector:");
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println("Entry at index " + i + ": " + retrievedVector.getEntry(i));
        }

        // Perform additional operations with the retrieved vector
        RealVector scaledVector = retrievedVector.mapMultiply(2.0);

        // Print out the scaled vector
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.println("Entry at index " + i + ": " + scaledVector.getEntry(i));
        }
    }
}