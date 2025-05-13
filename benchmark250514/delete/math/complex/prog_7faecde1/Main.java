import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using MatrixUtils
        /* write */
        RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(3, 3);

        // Additional operations to make the program more complex
        RealMatrix denseMatrix = new Array2DRowRealMatrix(new double[][] {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        });

        // Perform matrix addition
        RealMatrix resultMatrix = denseMatrix.add(sparseMatrix);

        // Display the result matrix
        System.out.println("Result of addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Assume we have a method to fetch the sparse matrix, here represented as getSparseMatrix
        /* read */
        RealMatrix fetchedMatrix = sparseMatrix; // Assuming getSparseMatrix() would return the matrix

        // Display the fetched sparse matrix to verify
        System.out.println("Fetched Sparse Matrix:");
        for (int i = 0; i < fetchedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < fetchedMatrix.getColumnDimension(); j++) {
                System.out.print(fetchedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Additional complex operations: Transpose the dense matrix
        RealMatrix transposedMatrix = denseMatrix.transpose();

        // Display the transposed matrix
        System.out.println("Transposed Dense Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}