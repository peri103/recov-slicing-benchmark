import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the dimensions and values for the sparse matrix
        int rows = 3;
        int columns = 3;
        double[][] data = {
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        };

        // Create a sparse matrix using MatrixUtils
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data);

        // Create another matrix for additional operations
        double[][] additionalData = {
            {5.0, 2.0, 1.0},
            {3.0, 6.0, 1.0},
            {4.0, 0.0, 7.0}
        };
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalData);

        // Perform matrix multiplication
        RealMatrix resultMatrix = sparseMatrix.multiply(additionalMatrix);

        // Calculate the determinant of the result matrix
        double determinant = new org.apache.commons.math3.linear.LUDecomposition(resultMatrix).getDeterminant();
        System.out.println("Determinant of the result matrix: " + determinant);

        // Perform some unrelated computations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares from 0 to 9: " + sum);

        // Read the sparse matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getSparseMatrix(sparseMatrix);

        // Display the matrix
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}