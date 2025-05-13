import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a matrix using MatrixUtils
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a vector and perform some operations
        double[] vectorData = {1.0, 0.0, -1.0};
        RealVector vector = new ArrayRealVector(vectorData);
        
        // Multiply matrix by vector
        RealVector resultVector = matrix.operate(vector);
        System.out.println("Result of matrix-vector multiplication: " + resultVector);

        // Perform matrix addition
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix addedMatrix = matrix.add(identityMatrix);
        System.out.println("Matrix after addition with identity matrix: ");
        System.out.println(addedMatrix);

        // Calculate the transpose of the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transpose of the matrix: ");
        System.out.println(transposedMatrix);

        // Read the matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = matrix; // Directly using the matrix object created by createRealMatrix
        System.out.println("Read matrix:");
        System.out.println(readMatrix);

        // Perform matrix subtraction
        RealMatrix subtractedMatrix = matrix.subtract(identityMatrix);
        System.out.println("Matrix after subtraction with identity matrix: ");
        System.out.println(subtractedMatrix);

        // Calculate the norm of the vector
        double norm = vector.getNorm();
        System.out.println("Norm of the vector: " + norm);

        // Scale the vector
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled vector: " + scaledVector);
    }
}