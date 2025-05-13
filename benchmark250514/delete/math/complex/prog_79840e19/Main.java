import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);
        
        // Additional operations to make the program more complex
        double[] additionalData = {4.0, 5.0, 6.0};
        ArrayRealVector additionalVector = new ArrayRealVector(additionalData);
        
        // Perform vector addition
        RealVector resultVector = vector.add(additionalVector);
        System.out.println("Result of vector addition: " + Arrays.toString(resultVector.toArray()));
        
        // Scalar multiplication
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled vector: " + Arrays.toString(scaledVector.toArray()));
        
        // Dot product
        double dotProduct = vector.dotProduct(additionalVector);
        System.out.println("Dot product: " + dotProduct);
        
        // Normalize the vector
        RealVector normalizedVector = vector.unitVector();
        System.out.println("Normalized vector: " + Arrays.toString(normalizedVector.toArray()));
        
        /* read */ ArrayRealVector readVector = MatrixUtils.getArrayRealVector(vector.getDataRef());
        
        System.out.println("Read vector: " + Arrays.toString(readVector.toArray()));
    }
}