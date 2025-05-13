import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a vector with some initial values
        double[] initialValues = {1.0, 2.0, 3.0};

        // Use MatrixUtils to create an ArrayRealVector
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(initialValues);

        // Perform some complex operations
        ArrayRealVector anotherVector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector sumVector = vector.add(anotherVector);
        RealVector differenceVector = vector.subtract(anotherVector);
        
        // Create a matrix and perform operations
        RealMatrix matrix = MatrixUtils.createRealIdentityMatrix(3);
        RealVector matrixResult = matrix.operate(vector);

        // Calculate dot product
        double dotProduct = vector.dotProduct(anotherVector);

        // Retrieve the ArrayRealVector using MatrixUtils
        /* read */ ArrayRealVector retrievedVector = MatrixUtils.getArrayRealVector(vector);

        // Print the retrieved vector values to ensure it matches the initial values
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println("Retrieved Vector Entry " + i + ": " + retrievedVector.getEntry(i));
        }

        // Print results of complex operations
        System.out.println("Sum Vector: " + sumVector);
        System.out.println("Difference Vector: " + differenceVector);
        System.out.println("Matrix Operation Result: " + matrixResult);
        System.out.println("Dot Product: " + dotProduct);
    }
}