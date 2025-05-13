import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix
        double[][] data = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Create a triangular matrix using the write method
        /* write */
        RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Perform some operations using RealVector
        double[] vectorData = {1, 2, 3};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = triangularMatrix.operate(vector);

        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Create another matrix for additional operations
        double[][] additionalData = {
            {10, 11, 12},
            {13, 14, 15},
            {16, 17, 18}
        };
        RealMatrix additionalMatrix = MatrixUtils.createRealMatrix(additionalData);

        // Calculate the sum of the two matrices
        RealMatrix sumMatrix = triangularMatrix.add(additionalMatrix);

        System.out.println("Sum of matrices:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the triangular matrix using the read method
        /* read */
        RealMatrix readMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the matrix to verify
        System.out.println("Triangular matrix read:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}