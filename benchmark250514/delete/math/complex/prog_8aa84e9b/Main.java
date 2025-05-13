import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using MatrixUtils
        /* write */
        RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(3, 3);

        // Create another matrix and perform some operations
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        RealMatrix resultMatrix = matrix.scalarMultiply(2.0);

        // Create a vector and perform some operations
        double[] vectorData = {1.0, 2.0, 3.0};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = vector.mapMultiply(3.0);

        // Read the sparse matrix using MatrixUtils
        /* read */
        RealMatrix readMatrix = MatrixUtils.getSparseMatrix(sparseMatrix);

        // Print the original and result matrices to verify
        System.out.println("Original Matrix: ");
        printMatrix(matrix);
        
        System.out.println("Result Matrix after scalar multiplication: ");
        printMatrix(resultMatrix);

        // Print the original and result vectors to verify
        System.out.println("Original Vector: ");
        printVector(vector);

        System.out.println("Result Vector after scalar multiplication: ");
        printVector(resultVector);

        // Print the sparse matrix to verify
        System.out.println("Sparse Matrix: ");
        printMatrix(readMatrix);
    }

    private static void printMatrix(RealMatrix matrix) {
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }

    private static void printVector(RealVector vector) {
        for (int i = 0; i < vector.getDimension(); i++) {
            System.out.print(vector.getEntry(i) + " ");
        }
        System.out.println();
    }
}