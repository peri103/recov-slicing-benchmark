import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the dimensions and values for the sparse matrix
        int rows = 3;
        int columns = 3;
        double[][] sparseData = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };

        // Create a sparse matrix using MatrixUtils
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(rows, columns, sparseData);

        // Create another matrix for additional operations
        double[][] denseData = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        RealMatrix denseMatrix = new Array2DRowRealMatrix(denseData);

        // Perform matrix multiplication
        RealMatrix resultMatrix = denseMatrix.multiply(sparseMatrix);

        // Create a vector and perform vector-matrix multiplication
        double[] vectorData = {1, 0, 0};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = denseMatrix.operate(vector);

        // Print the result of vector-matrix multiplication
        System.out.println("Vector-Matrix Multiplication Result:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Retrieve the sparse matrix using MatrixUtils
        /* read */ RealMatrix retrievedMatrix = sparseMatrix; // Assuming getSparseMatrix would return the same matrix

        // Print the retrieved matrix to verify
        System.out.println("Retrieved Sparse Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform additional operations on the dense matrix
        RealMatrix transposedMatrix = denseMatrix.transpose();
        System.out.println("Transposed Dense Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}