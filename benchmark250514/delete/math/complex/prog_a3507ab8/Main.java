import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create an OpenMapRealVector using the write method
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(new double[]{1.0, 2.0, 3.0});

        // Create an ArrayRealVector for additional complexity
        RealVector arrayVector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});

        // Perform some operations on the ArrayRealVector
        arrayVector.mapMultiplyToSelf(2.0); // Multiply each element by 2

        // Add the ArrayRealVector to the OpenMapRealVector
        vector.add(arrayVector);

        // Print the result of the addition
        System.out.println("After addition with ArrayRealVector:");
        for (int i = 0; i < vector.getDimension(); i++) {
            System.out.println(vector.getEntry(i));
        }

        // Perform some operations on the OpenMapRealVector
        vector.mapAddToSelf(1.0); // Add 1 to each element

        // Use a temporary variable to store intermediate results
        double sum = 0.0;
        for (int i = 0; i < vector.getDimension(); i++) {
            sum += vector.getEntry(i);
        }
        System.out.println("Sum of elements: " + sum);

        // Read the OpenMapRealVector using the read method
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector.toArray());

        // Print the values to verify the read operation
        System.out.println("Read vector:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println(readVector.getEntry(i));
        }

        // Create another RealVector for further complexity
        RealVector anotherVector = new ArrayRealVector(new double[]{7.0, 8.0, 9.0});

        // Subtract anotherVector from readVector
        RealVector resultVector = readVector.subtract(anotherVector);

        // Print the result of the subtraction
        System.out.println("Result after subtraction:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
    }
}