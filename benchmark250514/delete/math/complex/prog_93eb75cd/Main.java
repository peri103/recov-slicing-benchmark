import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Define dimensions and data for the sparse matrix
        int rows = 3;
        int columns = 3;
        double[][] data = {
            {0, 0, 1},
            {0, 2, 0},
            {3, 0, 0}
        };

        // Create a sparse matrix using MatrixUtils
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data, rows, columns);

        // Create a real vector for additional operations
        double[] vectorData = {1, 2, 3};
        RealVector vector = new ArrayRealVector(vectorData);

        // Perform some matrix-vector multiplication
        RealVector resultVector = sparseMatrix.operate(vector);

        // Print the result of the matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Calculate the transpose of the matrix
        RealMatrix transposeMatrix = sparseMatrix.transpose();

        // Perform operations on the transpose
        RealVector resultVectorTranspose = transposeMatrix.operate(vector);

        // Print the result of operations on the transpose
        System.out.println("Result of transpose matrix-vector multiplication:");
        for (int i = 0; i < resultVectorTranspose.getDimension(); i++) {
            System.out.print(resultVectorTranspose.getEntry(i) + " ");
        }
        System.out.println();

        // Read the sparse matrix
        /* read */ RealMatrix readMatrix = sparseMatrix;  // In this context, we directly use the created matrix

        // Print the read matrix to verify
        System.out.println("Read matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform some additional calculations with the read matrix
        RealMatrix matrixProduct = readMatrix.multiply(transposeMatrix);

        // Print the matrix product
        System.out.println("Matrix product:");
        for (int i = 0; i < matrixProduct.getRowDimension(); i++) {
            for (int j = 0; j < matrixProduct.getColumnDimension(); j++) {
                System.out.print(matrixProduct.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}