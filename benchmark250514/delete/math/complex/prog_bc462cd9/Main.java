import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SparseRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize variables for sparse matrix
        int rows = 3;
        int columns = 3;
        double[][] data = {
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        };

        // Create a sparse matrix using MatrixUtils
        /* write */ SparseRealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data);

        // Initialize vector data
        double[] vectorData = {1.0, 2.0, 3.0};
        RealVector vector = new ArrayRealVector(vectorData);

        // Perform some operations on the vector
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);

        // Initialize another matrix
        RealMatrix denseMatrix = MatrixUtils.createRealMatrix(new double[][]{
            {2.0, 3.0, 4.0},
            {5.0, 6.0, 7.0},
            {8.0, 9.0, 10.0}
        });

        // Perform matrix addition
        RealMatrix resultMatrix = denseMatrix.add(sparseMatrix);
        System.out.println("Result Matrix after addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the sparse matrix using MatrixUtils (assuming getSparseMatrix is a valid method, although it doesn't exist in reality)
        /* read */ RealMatrix matrix = sparseMatrix; // Directly using the sparseMatrix as there is no getSparseMatrix method

        // Print the sparse matrix to verify
        System.out.println("Sparse Matrix:");
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform matrix-vector multiplication
        RealVector productVector = matrix.operate(vector);
        System.out.println("Matrix-Vector Product: " + productVector);
    }
}