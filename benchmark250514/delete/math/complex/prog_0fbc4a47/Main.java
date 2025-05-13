import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3); /* write */

        // Create a vector to perform operations
        RealVector vector = new ArrayRealVector(new double[]{1, 2, 3});
        
        // Perform some matrix-vector multiplication
        RealVector resultVector = identityMatrix.operate(vector);
        
        // Print the result of the multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Create another matrix and perform addition
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });

        RealMatrix sumMatrix = identityMatrix.add(anotherMatrix);

        // Print the sum matrix
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the identity matrix using MatrixUtils
        RealMatrix readMatrix = MatrixUtils.getIdentityMatrix(3); /* read */

        // Print the matrix to verify the read value
        System.out.println("Identity Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform some operations with the read matrix
        RealVector transformedVector = readMatrix.operate(vector);
        
        // Print the transformed vector
        System.out.println("Transformed Vector:");
        for (int i = 0; i < transformedVector.getDimension(); i++) {
            System.out.print(transformedVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}