import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using MatrixUtils
        double[][] sparseData = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(sparseData.length, sparseData[0].length, sparseData);

        // Create a dense matrix for additional operations
        double[][] denseData = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        RealMatrix denseMatrix = new Array2DRowRealMatrix(denseData);

        // Perform matrix addition
        RealMatrix resultMatrix = denseMatrix.add(sparseMatrix);

        // Create a vector and perform multiplication with the dense matrix
        double[] vectorData = {1, 2, 3};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = denseMatrix.operate(vector);

        // Print the result of matrix addition
        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print the result of vector multiplication
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Read the sparse matrix using MatrixUtils
        /* read */ RealMatrix readSparseMatrix = sparseMatrix; // Directly use the sparseMatrix as there's no getSparseMatrix method

        // Print the read sparse matrix
        System.out.println("Read Sparse Matrix:");
        for (int i = 0; i < readSparseMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readSparseMatrix.getColumnDimension(); j++) {
                System.out.print(readSparseMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}