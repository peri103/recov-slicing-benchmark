import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a square matrix
        double[][] data = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Create a triangular matrix using MatrixUtils
        RealMatrix triangularMatrix = /* write */ MatrixUtils.createTriangularMatrix(data);

        // Additional operations with matrices
        double[][] additionalData = {
            {10, 11, 12},
            {13, 14, 15},
            {16, 17, 18}
        };

        RealMatrix additionalMatrix = MatrixUtils.createRealMatrix(additionalData);
        RealMatrix sumMatrix = triangularMatrix.add(additionalMatrix);

        // Vector operations
        double[] vectorData = {1, 2, 3};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = sumMatrix.operate(vector);

        // More complex operations
        RealMatrix productMatrix = sumMatrix.multiply(additionalMatrix);

        // Perform some calculations
        double determinant = productMatrix.getDeterminant();
        System.out.println("Determinant of the product matrix: " + determinant);

        // Read the triangular matrix using MatrixUtils
        RealMatrix readMatrix = /* read */ MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the read matrix
        System.out.println("Read Triangular Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print the result vector
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}