import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the vector with some data
        double[] data = {1.0, 2.0, 3.0};

        // Create an OpenMapRealVector using the write method
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(data);

        // Additional complex operations
        ArrayRealVector arrayVector = new ArrayRealVector(data);

        // Perform some operations on the ArrayRealVector
        arrayVector.mapAddToSelf(5.0); // Add 5 to each element
        System.out.println("ArrayRealVector after addition: " + arrayVector);

        // Create another OpenMapRealVector for operations
        OpenMapRealVector anotherVector = new OpenMapRealVector(data.length);
        anotherVector.setEntry(0, 10.0);
        anotherVector.setEntry(1, 20.0);
        anotherVector.setEntry(2, 30.0);

        // Perform addition of two vectors
        RealVector resultVector = vector.add(anotherVector);
        System.out.println("Resultant OpenMapRealVector after addition: " + resultVector);

        // Accessing an element from the original vector
        /* read */ OpenMapRealVector readVector = vector; // Since there's no getOpenMapRealVector method, just use the vector directly

        // Accessing an element to verify
        double value = readVector.getEntry(0);
        System.out.println("Read value from OpenMapRealVector: " + value);

        // Perform some operations on the resultVector
        double dotProduct = resultVector.dotProduct(arrayVector);
        System.out.println("Dot product of resultVector and arrayVector: " + dotProduct);

        // Normalize the resultVector
        RealVector normalizedVector = resultVector.mapDivide(resultVector.getNorm());
        System.out.println("Normalized resultVector: " + normalizedVector);
    }
}