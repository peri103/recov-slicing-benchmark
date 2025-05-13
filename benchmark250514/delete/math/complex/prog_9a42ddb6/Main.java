import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create an OpenMapRealVector using MatrixUtils
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        
        // Perform some unrelated operations
        Random random = new Random();
        double[] randomValues = new double[5];
        for (int i = 0; i < randomValues.length; i++) {
            randomValues[i] = random.nextDouble() * 10; // Generate random values
        }
        
        // Create an ArrayRealVector using random values
        ArrayRealVector arrayVector = new ArrayRealVector(randomValues);
        System.out.println("ArrayRealVector: " + arrayVector);
        
        // Scale the vector
        RealVector scaledVector = arrayVector.mapMultiply(2.0);
        System.out.println("Scaled ArrayRealVector: " + scaledVector);
        
        // Read the OpenMapRealVector using MatrixUtils
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);

        // Output the OpenMapRealVector for verification
        System.out.println("OpenMapRealVector: " + readVector);

        // Add the scaled vector to the OpenMapRealVector
        RealVector combinedVector = readVector.add(scaledVector);
        System.out.println("Combined Vector: " + combinedVector);
        
        // Calculate the norm of the combined vector
        double norm = combinedVector.getNorm();
        System.out.println("Norm of Combined Vector: " + norm);
    }
}