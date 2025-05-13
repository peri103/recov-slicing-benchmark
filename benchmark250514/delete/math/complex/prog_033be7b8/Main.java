import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(new double[]{1, 2, 3});
        RealVector resultVector = identityMatrix.operate(vector);

        // Print the result of matrix-vector multiplication
        System.out.println("Result of identity matrix multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Create another matrix and perform operations
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][] {
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        });

        RealMatrix multipliedMatrix = identityMatrix.multiply(anotherMatrix);

        // Print the multiplied matrix
        System.out.println("Result of multiplying identity matrix with another matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform operations on the identity matrix
        RealMatrix transposedMatrix = identityMatrix.transpose();

        // Print the transposed matrix
        System.out.println("Transposed identity matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the identity matrix
        /* read */ RealMatrix readMatrix = identityMatrix; // Since there's no getIdentityMatrix method, we use the created matrix directly

        // Print the matrix to verify
        System.out.println("Read identity matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}