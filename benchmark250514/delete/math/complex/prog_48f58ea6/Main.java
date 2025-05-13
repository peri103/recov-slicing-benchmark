import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix with some values
        double[][] data = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Create a RealMatrix object using the data
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a triangular matrix from the RealMatrix
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(matrix, true);

        // Perform some unrelated operations with vectors
        double[] vectorData = {1, 2, 3};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);

        // Perform matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);
        System.out.println("Matrix-Vector Product: " + resultVector);

        // Retrieve the triangular matrix
        /* read */ RealMatrix readMatrix = triangularMatrix; // Since we already have it

        // Print the retrieved triangular matrix
        System.out.println("Triangular Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Create a new matrix and perform addition
        double[][] additionData = {
            {10, 11, 12},
            {13, 14, 15},
            {16, 17, 18}
        };
        RealMatrix additionMatrix = MatrixUtils.createRealMatrix(additionData);
        RealMatrix sumMatrix = matrix.add(additionMatrix);
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}