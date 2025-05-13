import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix with sample values
        double[][] data = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Initialize a vector with sample values
        double[] vectorData = {1, 2, 3};

        // Create a triangular matrix using the write method
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Perform operations on the matrix
        RealMatrix multipliedMatrix = triangularMatrix.scalarMultiply(2.0);

        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = multipliedMatrix.operate(vector);

        // Print the result of the vector operation
        System.out.println("Resulting Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Additional matrix operations
        RealMatrix transposedMatrix = triangularMatrix.transpose();
        double matrixNorm = transposedMatrix.getNorm();

        System.out.println("Matrix Norm: " + matrixNorm);

        // Read the triangular matrix using the read method
        /* read */ RealMatrix readMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the read matrix to verify the operation
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}