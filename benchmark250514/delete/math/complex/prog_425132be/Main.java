import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a double array to be used for the vector
        double[] data = {1.0, 2.0, 3.0};

        // Create an ArrayRealVector using MatrixUtils
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);

        // Perform some operations on the vector
        RealVector scaledVector = vector.mapMultiply(2.0); // Scale the vector by 2
        System.out.println("Scaled Vector: " + scaledVector);

        // Create another vector and perform addition
        double[] otherData = {4.0, 5.0, 6.0};
        ArrayRealVector otherVector = new ArrayRealVector(otherData);
        RealVector sumVector = vector.add(otherVector);
        System.out.println("Sum Vector: " + sumVector);

        // Create a matrix and perform matrix-vector multiplication
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new BlockRealMatrix(matrixData);
        RealVector resultVector = matrix.operate(vector);
        System.out.println("Matrix-Vector Multiplication Result: " + resultVector);

        // Retrieve the ArrayRealVector using MatrixUtils
        /* read */ ArrayRealVector retrievedVector = MatrixUtils.getArrayRealVector(vector);

        // Print the retrieved vector to verify its content
        System.out.println("Retrieved Vector: " + retrievedVector);

        // Perform additional operations on the retrieved vector
        RealVector negatedVector = retrievedVector.mapMultiply(-1.0); // Negate the vector
        System.out.println("Negated Vector: " + negatedVector);

        // Calculate the dot product of the original vector and the negated vector
        double dotProduct = vector.dotProduct(negatedVector);
        System.out.println("Dot Product: " + dotProduct);
    }
}