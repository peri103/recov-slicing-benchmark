import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Perform some unrelated matrix operations
        RealMatrix matrixA = MatrixUtils.createRealMatrix(new double[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });

        RealMatrix matrixB = MatrixUtils.createRealMatrix(new double[][] {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        });

        // Add two matrices
        RealMatrix matrixC = matrixA.add(matrixB);

        // Multiply a matrix by a scalar
        RealMatrix matrixD = matrixC.scalarMultiply(0.5);

        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[] {1, 2, 3});
        RealVector scaledVector = vector.mapMultiply(2.0);
        RealVector addedVector = vector.add(scaledVector);

        // Read the identity matrix
        /* read */ RealMatrix readMatrix = identityMatrix;

        // Print the identity matrix to verify
        System.out.println("Identity Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print matrix operations results
        System.out.println("\nMatrix C:");
        for (int i = 0; i < matrixC.getRowDimension(); i++) {
            for (int j = 0; j < matrixC.getColumnDimension(); j++) {
                System.out.print(matrixC.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatrix D:");
        for (int i = 0; i < matrixD.getRowDimension(); i++) {
            for (int j = 0; j < matrixD.getColumnDimension(); j++) {
                System.out.print(matrixD.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print vector operations results
        System.out.println("\nOriginal Vector: " + vector);
        System.out.println("Scaled Vector: " + scaledVector);
        System.out.println("Added Vector: " + addedVector);
    }
}