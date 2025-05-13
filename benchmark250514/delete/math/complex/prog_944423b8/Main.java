import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a new OpenMapRealVector with specified size
        OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(3);
        
        // Initialize vector with some values
        vector.setEntry(0, 1.0);
        vector.setEntry(1, 2.0);
        vector.setEntry(2, 3.0);
        
        // Write operation: createOpenMapRealVector
        /* write */ OpenMapRealVector writeVector = MatrixUtils.createOpenMapRealVector(vector.getDimension());
        writeVector.setSubVector(0, vector);
        
        // Additional unrelated code: create and manipulate an ArrayRealVector
        ArrayRealVector arrayVector = new ArrayRealVector(3);
        arrayVector.setEntry(0, 4.0);
        arrayVector.setEntry(1, 5.0);
        arrayVector.setEntry(2, 6.0);
        
        // Perform some operations on ArrayRealVector
        RealVector sumVector = arrayVector.add(vector);
        System.out.println("Sum of vectors: ");
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.println("Value at index " + i + ": " + sumVector.getEntry(i));
        }
        
        // Further manipulation of OpenMapRealVector
        writeVector.mapMultiplyToSelf(2.0);
        System.out.println("After multiplication: ");
        for (int i = 0; i < writeVector.getDimension(); i++) {
            System.out.println("Value at index " + i + ": " + writeVector.getEntry(i));
        }
        
        // Read operation: getOpenMapRealVector
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(writeVector);
        
        // Display the values in the read vector
        System.out.println("Read vector values: ");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println("Value at index " + i + ": " + readVector.getEntry(i));
        }
        
        // Additional unrelated code: further operations on ArrayRealVector
        RealVector diffVector = arrayVector.subtract(vector);
        System.out.println("Difference of vectors: ");
        for (int i = 0; i < diffVector.getDimension(); i++) {
            System.out.println("Value at index " + i + ": " + diffVector.getEntry(i));
        }
    }
}