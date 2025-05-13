import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using the write method
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Create a vector to perform operations with the matrix
        RealVector vector = new ArrayRealVector(new double[]{1, 2, 3});

        // Perform matrix-vector multiplication
        RealVector resultVector = identityMatrix.operate(vector);

        // Print the result of the matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Additional complex operations: scaling the matrix
        RealMatrix scaledMatrix = identityMatrix.scalarMultiply(2.0);

        // Print the scaled matrix
        System.out.println("Scaled matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the identity matrix using the read method
        // Note: There is no direct getIdentityMatrix method in the MatrixUtils class.
        // We will assume this is intended to be a conceptual step to use the matrix created.
        /* read */ RealMatrix readMatrix = identityMatrix; // Using the created matrix as the read step

        // Print the matrix to verify
        System.out.println("Identity matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Additional complex operations: matrix addition with itself
        RealMatrix addedMatrix = identityMatrix.add(identityMatrix);

        // Print the added matrix
        System.out.println("Matrix added with itself:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}