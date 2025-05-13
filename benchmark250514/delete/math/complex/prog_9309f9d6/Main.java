import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealVector;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create an OpenMapRealVector using the write method
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(new double[]{1.0, 2.0, 3.0});

        // Additional complex code using RealVector
        RealVector additionalVector = new OpenMapRealVector(3);
        for (int i = 0; i < 3; i++) {
            additionalVector.setEntry(i, new Random().nextDouble() * 10);
        }

        // Perform some operations on the additionalVector
        RealVector scaledVector = additionalVector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);

        // More operations on the original vector
        vector.setEntry(0, 10.0);
        vector.setEntry(1, 20.0);
        vector.setEntry(2, 30.0);

        // Compute the dot product of vector and additionalVector
        double dotProduct = vector.dotProduct(additionalVector);
        System.out.println("Dot Product: " + dotProduct);

        // Read the vector using the read method
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);

        // Print the vector to verify the read operation
        System.out.println("Read Vector: " + readVector);

        // Further operations on readVector
        RealVector normalizedVector = readVector.mapDivide(readVector.getNorm());
        System.out.println("Normalized Vector: " + normalizedVector);

        // Final operation to verify all steps
        double finalDotProduct = readVector.dotProduct(normalizedVector);
        System.out.println("Final Dot Product with Normalized Vector: " + finalDotProduct);
    }
}