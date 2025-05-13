import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize dimensions and data for the sparse matrix
        int rows = 3;
        int columns = 3;
        double[][] data = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };

        // Create a sparse matrix using MatrixUtils
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data, rows, columns);

        // Additional unrelated matrix operations
        double[][] data2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        RealMatrix denseMatrix = MatrixUtils.createRealMatrix(data2);
        RealMatrix multipliedMatrix = denseMatrix.multiply(sparseMatrix);
        
        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{1, 2, 3});
        RealVector resultVector = denseMatrix.operate(vector);

        // Perform some calculations with the vector
        double vectorNorm = resultVector.getNorm();
        System.out.println("Vector Norm: " + vectorNorm);

        // Access an entry in the sparse matrix to ensure it was written correctly
        // This is the read operation from the original task
        /* read */ double value = sparseMatrix.getEntry(1, 1);

        // Print the value to ensure it was read correctly
        System.out.println("Value at (1, 1): " + value);

        // Further operations on the matrix
        RealMatrix transposedMatrix = denseMatrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}