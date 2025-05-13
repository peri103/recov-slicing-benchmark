import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create an OpenMapRealVector using the write method
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        
        // Perform some operations on the vector to make the program more complex
        vector.setEntry(0, 5.0);
        vector.setEntry(1, 6.0);
        vector.setEntry(2, 7.0);

        // Create another vector using a different method
        RealVector denseVector = MatrixUtils.createRealVector(new double[]{10.0, 20.0, 30.0});

        // Add the two vectors
        RealVector resultVector = vector.add(denseVector);

        // Output the result of the addition
        System.out.println("Result of addition:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println("Element at index " + i + ": " + resultVector.getEntry(i));
        }

        // Perform some more operations on the original vector
        vector.mapMultiplyToSelf(2.0);

        // Create yet another vector using a different method
        RealVector sparseVector = MatrixUtils.createSparseRealVector(new double[]{100.0, 200.0, 300.0});

        // Subtract the sparse vector from the original vector
        RealVector subtractionResult = vector.subtract(sparseVector);

        // Output the result of the subtraction
        System.out.println("Result of subtraction:");
        for (int i = 0; i < subtractionResult.getDimension(); i++) {
            System.out.println("Element at index " + i + ": " + subtractionResult.getEntry(i));
        }

        // Read the OpenMapRealVector using the read method
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);

        // Output the contents of the read vector to verify the read operation
        System.out.println("Contents of the read vector:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println("Element at index " + i + ": " + readVector.getEntry(i));
        }
    }
}