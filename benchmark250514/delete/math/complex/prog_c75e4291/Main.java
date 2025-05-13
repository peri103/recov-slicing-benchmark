import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a sample square matrix
        double[][] data = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Create a triangular matrix using the write method
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Perform some additional operations on matrices
        double[][] anotherData = {
            {10, 11, 12},
            {13, 14, 15},
            {16, 17, 18}
        };

        // Create another matrix
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(anotherData);

        // Add the two matrices
        RealMatrix sumMatrix = triangularMatrix.add(anotherMatrix);

        // Perform scalar multiplication on the sum matrix
        RealMatrix scaledMatrix = sumMatrix.scalarMultiply(0.5);

        // Print the scaled matrix
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the triangular matrix using the read method
        /* read */ RealMatrix readMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Output the read matrix
        System.out.println("\nTriangular Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}