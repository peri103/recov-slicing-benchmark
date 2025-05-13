import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize variables
        double[][] data = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Create a triangular matrix using the write method
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Additional operations on matrices
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix multipliedMatrix = triangularMatrix.multiply(identityMatrix);

        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[] {1, 2, 3});
        RealVector resultVector = multipliedMatrix.operate(vector);

        // Print the result of vector operations
        System.out.println("Resulting vector: " + resultVector);

        // Further matrix manipulations
        RealMatrix addedMatrix = multipliedMatrix.add(identityMatrix);
        System.out.println("Added Matrix: " + addedMatrix);

        // Read the triangular matrix using the read method
        /* read */ RealMatrix readMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the read matrix
        System.out.println("Read Triangular Matrix: " + readMatrix);

        // Additional matrix operations
        RealMatrix subtractedMatrix = readMatrix.subtract(identityMatrix);
        System.out.println("Subtracted Matrix: " + subtractedMatrix);

        // Another vector operation
        RealVector subtractedVector = subtractedMatrix.operate(new ArrayRealVector(new double[] {3, 2, 1}));
        System.out.println("Subtracted Vector: " + subtractedVector);
    }
}