import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(new double[]{1, 2, 3});
        RealVector resultVector = identityMatrix.operate(vector);

        // Print the resulting vector after operation
        System.out.println("Resulting Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform matrix multiplication with another matrix
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][]{
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        });
        RealMatrix multipliedMatrix = identityMatrix.multiply(anotherMatrix);

        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the identity matrix created earlier
        /* read */ RealMatrix readMatrix = identityMatrix;

        // Print the matrix to verify
        System.out.println("Identity Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Create another vector and perform operations
        RealVector anotherVector = new ArrayRealVector(new double[]{4, 5, 6});
        RealVector resultVector2 = multipliedMatrix.operate(anotherVector);

        // Print the resulting vector after operation
        System.out.println("Resulting Vector 2:");
        for (int i = 0; i < resultVector2.getDimension(); i++) {
            System.out.print(resultVector2.getEntry(i) + " ");
        }
        System.out.println();
    }
}