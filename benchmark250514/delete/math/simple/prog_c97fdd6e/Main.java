import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Create a vector with some initial values
        double[] initialValues = {1.0, 2.0, 3.0};

        // Use MatrixUtils to create an ArrayRealVector
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(initialValues);

        // Retrieve the ArrayRealVector using MatrixUtils
        /* read */ ArrayRealVector retrievedVector = MatrixUtils.getArrayRealVector(vector);

        // Print the retrieved vector values to ensure it matches the initial values
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println(retrievedVector.getEntry(i));
        }
    }
}