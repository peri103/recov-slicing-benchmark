import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Hypothetical creation of a triangular matrix
        double[][] data = {
            {1, 0, 0},
            {2, 3, 0},
            {4, 5, 6}
        };

        // Create a triangular matrix using the hypothetical method
        /* write */
        RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Create another matrix and perform operations
        double[][] additionalData = {
            {7, 8, 9},
            {10, 11, 12},
            {13, 14, 15}
        };
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalData);

        // Add the additional matrix to the triangular matrix
        RealMatrix sumMatrix = triangularMatrix.add(additionalMatrix);

        // Create a vector and perform operations
        double[] vectorData = {1, 2, 3};
        RealVector vector = new ArrayRealVector(vectorData);

        // Multiply the vector with the sum matrix
        RealVector resultVector = sumMatrix.operate(vector);

        // Print the result vector
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Retrieve the triangular matrix using the hypothetical method
        /* read */
        RealMatrix readMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the matrix to verify
        System.out.println("Triangular Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}