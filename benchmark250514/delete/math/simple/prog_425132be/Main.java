import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a double array to be used for the vector
        double[] data = {1.0, 2.0, 3.0};

        // Create an ArrayRealVector using MatrixUtils
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);

        // Retrieve the ArrayRealVector using MatrixUtils
        /* read */ ArrayRealVector retrievedVector = MatrixUtils.getArrayRealVector(vector);

        // Print the retrieved vector to verify its content
        System.out.println(retrievedVector);
    }
}