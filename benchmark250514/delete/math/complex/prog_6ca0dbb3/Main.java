import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using MatrixUtils
        OpenMapRealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(3, 3);
        /* write */ sparseMatrix.setEntry(0, 0, 1.0); // set a value to ensure the matrix is not empty

        // Create a dense matrix and perform operations
        Array2DRowRealMatrix denseMatrix = new Array2DRowRealMatrix(3, 3);
        denseMatrix.setEntry(0, 0, 2.0);
        denseMatrix.setEntry(1, 1, 3.0);
        denseMatrix.setEntry(2, 2, 4.0);

        // Create a real vector and perform operations
        RealVector vector = new ArrayRealVector(3);
        vector.setEntry(0, 1.0);
        vector.setEntry(1, 2.0);
        vector.setEntry(2, 3.0);

        // Perform matrix-vector multiplication
        RealVector resultVector = denseMatrix.operate(vector);
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Read the sparse matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = sparseMatrix;
        
        // Print the value at (0, 0) to verify the read operation
        System.out.println("Sparse matrix value at (0, 0): " + readMatrix.getEntry(0, 0));

        // Perform matrix addition
        RealMatrix addedMatrix = denseMatrix.add(readMatrix);
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}