import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Create another matrix and perform some operations
        RealMatrix matrixA = MatrixUtils.createRealMatrix(new double[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });

        // Multiply matrixA with the identity matrix
        RealMatrix resultMatrix = matrixA.multiply(identityMatrix);

        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(new double[] {1, 2, 3});
        RealVector resultVector = matrixA.operate(vector);

        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform some additional operations
        RealMatrix matrixB = matrixA.transpose();
        RealMatrix sumMatrix = matrixA.add(matrixB);

        // Print the sum matrix
        System.out.println("Sum of matrixA and its transpose:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the identity matrix (simulating the read operation)
        /* read */ RealMatrix readMatrix = identityMatrix; // Simulating the read operation

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