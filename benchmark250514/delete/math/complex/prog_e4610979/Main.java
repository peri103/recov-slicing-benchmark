import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create an OpenMapRealVector instance
        OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(3);
        
        // Set values in the vector
        vector.setEntry(0, 1.0);
        vector.setEntry(1, 2.0);
        vector.setEntry(2, 3.0);
        
        // Perform some operations on the OpenMapRealVector
        vector.mapAddToSelf(5.0);
        vector.mapMultiplyToSelf(2.0);
        
        // Create an ArrayRealVector for additional complexity
        RealVector arrayVector = new ArrayRealVector(new double[] {4.0, 5.0, 6.0});
        
        // Add the two vectors
        RealVector resultVector = vector.add(arrayVector);
        
        // Print the result vector
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println("Result Vector Entry " + i + ": " + resultVector.getEntry(i));
        }
        
        // Retrieve the OpenMapRealVector instance using MatrixUtils
        /* read */ OpenMapRealVector retrievedVector = MatrixUtils.getOpenMapRealVector(vector);
        
        // Print the values to verify
        System.out.println(retrievedVector.getEntry(0));
        System.out.println(retrievedVector.getEntry(1));
        System.out.println(retrievedVector.getEntry(2));
        
        // Create another OpenMapRealVector for further operations
        OpenMapRealVector anotherVector = MatrixUtils.createOpenMapRealVector(3);
        anotherVector.setEntry(0, 7.0);
        anotherVector.setEntry(1, 8.0);
        anotherVector.setEntry(2, 9.0);
        
        // Subtract the vectors
        RealVector subtractedVector = anotherVector.subtract(retrievedVector);
        
        // Print the subtracted vector
        for (int i = 0; i < subtractedVector.getDimension(); i++) {
            System.out.println("Subtracted Vector Entry " + i + ": " + subtractedVector.getEntry(i));
        }
    }
}