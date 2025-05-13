import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        double[] data2 = {4.0, 5.0, 6.0};

        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);

        // Perform some operations on the vector
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);

        // Create another vector and perform addition
        ArrayRealVector vector2 = new ArrayRealVector(data2);
        RealVector addedVector = vector.add(vector2);
        System.out.println("Added Vector: " + addedVector);

        // Calculate the dot product
        double dotProduct = vector.dotProduct(vector2);
        System.out.println("Dot Product: " + dotProduct);

        // Perform some unrelated operations
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum of numbers: " + sum);

        /* read */ ArrayRealVector readVector = MatrixUtils.getArrayRealVector(vector);

        // More operations on the read vector
        double norm = readVector.getNorm();
        System.out.println("Norm of the read vector: " + norm);

        // Print the read vector
        System.out.println("Read Vector: " + readVector);
    }
}