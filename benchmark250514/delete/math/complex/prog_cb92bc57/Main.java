import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize data
        double[] data = {1.0, 2.0, 3.0};

        // Create a vector using MatrixUtils
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);

        // Perform some operations on the vector
        RealVector scaledVector = vector.mapMultiply(2.0);
        RealVector addedVector = vector.add(new ArrayRealVector(new double[]{4.0, 5.0, 6.0}));

        // Print the results of operations
        System.out.println("Scaled Vector: " + scaledVector);
        System.out.println("Added Vector: " + addedVector);

        // More complex operations
        double dotProduct = vector.dotProduct(scaledVector);
        System.out.println("Dot Product: " + dotProduct);

        // Create another vector
        ArrayRealVector anotherVector = new ArrayRealVector(new double[]{7.0, 8.0, 9.0});
        RealVector subtractedVector = anotherVector.subtract(vector);
        System.out.println("Subtracted Vector: " + subtractedVector);

        // Retrieve the original vector using MatrixUtils
        /* read */ ArrayRealVector readVector = MatrixUtils.getArrayRealVector(vector);

        // Print the retrieved vector
        System.out.println("Read Vector: " + readVector);

        // Further operations on the retrieved vector
        RealVector normalizedVector = readVector.unitVector();
        System.out.println("Normalized Vector: " + normalizedVector);

        // Combine vectors
        RealVector combinedVector = readVector.add(normalizedVector);
        System.out.println("Combined Vector: " + combinedVector);
    }
}