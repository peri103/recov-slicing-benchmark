import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the OpenMapRealVector with a size of 3
        OpenMapRealVector vector = new OpenMapRealVector(3);
        
        // Write a value to the vector at index 0
        vector.setEntry(0, 1.0);
        /* write */ MatrixUtils.createOpenMapRealVector(vector);

        // Create another vector using ArrayRealVector
        RealVector arrayVector = new ArrayRealVector(new double[] {2.0, 3.0, 4.0});
        
        // Perform some operations on arrayVector
        arrayVector.mapAddToSelf(1.0);
        double sum = arrayVector.getL1Norm();
        System.out.println("Sum of arrayVector elements after addition: " + sum);

        // Create a new OpenMapRealVector with different values
        OpenMapRealVector anotherVector = new OpenMapRealVector(3);
        anotherVector.setEntry(0, 5.0);
        anotherVector.setEntry(1, 6.0);
        anotherVector.setEntry(2, 7.0);

        // Perform element-wise multiplication with arrayVector
        RealVector multipliedVector = arrayVector.ebeMultiply(anotherVector);
        System.out.println("Element-wise multiplication result:");
        for (int i = 0; i < multipliedVector.getDimension(); i++) {
            System.out.println(multipliedVector.getEntry(i));
        }

        // Read the value from the original vector at index 0
        OpenMapRealVector readVector = /* read */ MatrixUtils.getOpenMapRealVector(vector);
        double value = readVector.getEntry(0);
        
        // Print the value
        System.out.println("Value read from original vector: " + value);

        // Perform some more operations on readVector
        readVector.setEntry(1, 8.0);
        readVector.setEntry(2, 9.0);

        // Calculate the norm of the readVector
        double norm = readVector.getNorm();
        System.out.println("Norm of readVector: " + norm);
    }
}