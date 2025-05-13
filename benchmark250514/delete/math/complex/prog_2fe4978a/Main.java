import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using the write method
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Perform some operations on the matrix
        RealVector vector = new ArrayRealVector(new double[]{1, 2, 3});
        RealVector resultVector = identityMatrix.operate(vector);
        System.out.println("Result of multiplying identity matrix with vector: " + resultVector);

        // Create another matrix and perform addition
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][]{
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        });
        RealMatrix sumMatrix = identityMatrix.add(anotherMatrix);
        System.out.println("Sum of identity matrix and another matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Create a vector and perform subtraction
        RealVector subtractVector = vector.subtract(resultVector);
        System.out.println("Result of vector subtraction: " + subtractVector);

        // Read the identity matrix using the read method
        /* read */ RealMatrix readMatrix = MatrixUtils.getIdentityMatrix(3);

        // Print the identity matrix to verify
        System.out.println("Identity Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}