import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a square matrix with some values
        double[][] data = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Create a triangular matrix using MatrixUtils
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = triangularMatrix.transpose();
        RealVector vector = new ArrayRealVector(new double[]{1, 2, 3});
        RealVector resultVector = transposedMatrix.operate(vector);

        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform additional operations on the matrix
        RealMatrix scaledMatrix = triangularMatrix.scalarMultiply(2.0);
        RealMatrix addedMatrix = triangularMatrix.add(scaledMatrix);

        // Print the added matrix
        System.out.println("Added matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the triangular matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the read matrix to verify the operation
        System.out.println("Read triangular matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}