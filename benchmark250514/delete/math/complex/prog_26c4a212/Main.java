import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealVector;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Initialize the vector with some values
        double[] values = {1.0, 2.0, 3.0};
        
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(values);
        
        // Perform some unrelated computations
        double[] randomValues = new double[5];
        Random random = new Random();
        for (int i = 0; i < randomValues.length; i++) {
            randomValues[i] = random.nextDouble() * 10;
        }
        
        OpenMapRealVector randomVector = new OpenMapRealVector(randomValues);
        RealVector sumVector = vector.add(randomVector);
        
        // Print the sum of vectors
        System.out.println("Sum of vectors:");
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.println(sumVector.getEntry(i));
        }
        
        // Perform some operations on the original vector
        double scaleFactor = 2.0;
        OpenMapRealVector scaledVector = vector.mapMultiply(scaleFactor);
        
        // Print the scaled vector
        System.out.println("Scaled vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.println(scaledVector.getEntry(i));
        }
        
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);
        
        // Print the values to verify
        System.out.println("Original vector:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println(readVector.getEntry(i));
        }
        
        // Perform additional operations
        double dotProduct = vector.dotProduct(randomVector);
        System.out.println("Dot product of original and random vectors: " + dotProduct);
        
        RealVector unitVector = vector.unitVector();
        System.out.println("Unit vector:");
        for (int i = 0; i < unitVector.getDimension(); i++) {
            System.out.println(unitVector.getEntry(i));
        }
    }
}