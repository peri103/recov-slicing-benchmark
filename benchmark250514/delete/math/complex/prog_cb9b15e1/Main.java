import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a sparse matrix using MatrixUtils
        RealMatrix sparseMatrix;
        /* write */ sparseMatrix = MatrixUtils.createSparseMatrix(3, 3);

        // Create a dense matrix for complex operations
        RealMatrix denseMatrix = MatrixUtils.createRealMatrix(new double[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });

        // Perform operations on the dense matrix
        RealMatrix transposedMatrix = denseMatrix.transpose();
        RealVector vector = new ArrayRealVector(new double[] {1, 2, 3});
        RealVector resultVector = transposedMatrix.operate(vector);

        // Print results of operations
        System.out.println("Dense Matrix Transpose:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Read the sparse matrix using MatrixUtils (here we simply refer to the created matrix)
        /* read */ RealMatrix readMatrix = sparseMatrix;

        // Print the sparse matrix to verify
        System.out.println("Sparse Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}