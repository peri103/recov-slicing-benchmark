import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a triangular matrix
        double[][] data = {
            {1, 2, 3},
            {0, 4, 5},
            {0, 0, 6}
        };

        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Perform some unrelated matrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix productMatrix = triangularMatrix.multiply(identityMatrix);

        // Initialize a vector and perform vector-matrix multiplication
        RealVector vector = new ArrayRealVector(new double[] {1, 2, 3});
        RealVector resultVector = productMatrix.operate(vector);

        // Print the result of vector-matrix multiplication
        System.out.println("Result of vector-matrix multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // More complex operations: Calculate the transpose of the product matrix
        RealMatrix transposeMatrix = productMatrix.transpose();

        // Print the transpose matrix
        System.out.println("Transpose of the product matrix:");
        for (int i = 0; i < transposeMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposeMatrix.getColumnDimension(); j++) {
                System.out.print(transposeMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ RealMatrix readMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the read matrix to verify the read operation
        System.out.println("Read triangular matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}