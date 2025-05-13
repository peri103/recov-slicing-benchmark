import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix using MatrixUtils
        double[][] data = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);

        // Create a vector and perform some operations
        double[] vectorData = {1, 2, 3};
        RealVector vector = new ArrayRealVector(vectorData);

        // Multiply the vector by the symmetric matrix
        RealVector resultVector = symmetricMatrix.operate(vector);

        // Print the result of the vector operation
        System.out.println("Result of multiplying vector by symmetric matrix: " + resultVector);

        // More complex operations on the matrix
        RealMatrix transposedMatrix = symmetricMatrix.transpose();
        RealMatrix addedMatrix = symmetricMatrix.add(transposedMatrix);

        // Print the transposed and added matrices
        System.out.println("Transposed Matrix: " + transposedMatrix);
        System.out.println("Added Matrix: " + addedMatrix);

        // Perform a matrix operation and store the result
        RealMatrix scaledMatrix = symmetricMatrix.scalarMultiply(2.0);

        // More operations on vectors
        RealVector scaledVector = vector.mapMultiply(2.0);
        RealVector addedVector = vector.add(scaledVector);

        // Print the scaled and added vectors
        System.out.println("Scaled Vector: " + scaledVector);
        System.out.println("Added Vector: " + addedVector);

        // Retrieve the symmetric matrix using MatrixUtils (assuming getSymmetricMatrix is a correct method)
        // Note: getSymmetricMatrix is not a real method in MatrixUtils, but for the purpose of this task, we assume it exists.
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);

        // Print the matrix to verify the result
        System.out.println("Retrieved Symmetric Matrix: " + retrievedMatrix);
    }
}