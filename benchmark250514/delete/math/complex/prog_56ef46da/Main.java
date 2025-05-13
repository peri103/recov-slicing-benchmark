import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix dimensions and values
        int rows = 3;
        int columns = 3;
        double[][] data = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };

        // Use the MatrixUtils to create a sparse matrix
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(rows, columns, data);

        // Create a dense matrix for additional complexity
        double[][] denseData = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        RealMatrix denseMatrix = MatrixUtils.createRealMatrix(denseData);

        // Perform matrix operations
        RealMatrix resultMatrix = denseMatrix.add(sparseMatrix);

        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[] {1, 2, 3});
        RealVector resultVector = denseMatrix.operate(vector);

        // Access the sparse matrix (in this context, we assume a hypothetical method getSparseMatrix)
        /* read */ RealMatrix readMatrix = sparseMatrix; // In practice, this line is for demonstration

        // Print the matrices and vectors to verify
        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        System.out.println("Read Sparse Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}