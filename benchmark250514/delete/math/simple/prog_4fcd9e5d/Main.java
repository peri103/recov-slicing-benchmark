import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize the data array
        double[] data = {1.0, 2.0, 3.0};

        // Create an ArrayRealVector using the write method
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);

        // Retrieve the ArrayRealVector using the read method
        /* read */ ArrayRealVector retrievedVector = MatrixUtils.getArrayRealVector(vector);

        // Print the retrieved vector to ensure it matches the original
        System.out.println(retrievedVector);
    }
}