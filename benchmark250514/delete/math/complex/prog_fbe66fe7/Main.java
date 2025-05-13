import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Create a random vector
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});

        // Multiply the identity matrix with the vector
        RealVector resultVector = identityMatrix.operate(vector);

        // Create another matrix and vector for additional operations
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });

        RealVector anotherVector = new ArrayRealVector(new double[]{0.5, 1.5, 2.5});

        // Perform matrix-vector multiplication
        RealVector anotherResult = anotherMatrix.operate(anotherVector);

        // Print the result of the multiplication
        System.out.println("Result of identity matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Print the result of another matrix-vector multiplication
        System.out.println("Result of another matrix-vector multiplication:");
        for (int i = 0; i < anotherResult.getDimension(); i++) {
            System.out.print(anotherResult.getEntry(i) + " ");
        }
        System.out.println();

        // Read the identity matrix
        /* read */ RealMatrix readMatrix = identityMatrix; // Since there's no direct getIdentityMatrix method, we use the matrix created

        // Print the matrix to verify
        System.out.println("Identity matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}