import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Create another matrix and perform some operations
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });

        // Multiply the identity matrix with another matrix
        RealMatrix resultMatrix = identityMatrix.multiply(anotherMatrix);

        // Display the result of the multiplication
        System.out.println("Result of multiplying identity matrix with another matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(new double[]{1, 2, 3});
        RealVector transformedVector = identityMatrix.operate(vector);

        // Display the transformed vector
        System.out.println("Transformed vector:");
        for (int i = 0; i < transformedVector.getDimension(); i++) {
            System.out.print(transformedVector.getEntry(i) + " ");
        }
        System.out.println();

        // Read the identity matrix created
        /* read */ RealMatrix readMatrix = MatrixUtils.getIdentityMatrix(3);

        // Print the matrix to verify
        System.out.println("Identity Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}