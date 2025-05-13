import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using MatrixUtils
        RealMatrix matrix;
        /* write */ matrix = MatrixUtils.createSparseMatrix(3, 3);

        // Perform some operations on the matrix
        matrix.setEntry(0, 0, 1.0);
        matrix.setEntry(1, 1, 2.0);
        matrix.setEntry(2, 2, 3.0);

        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(3);
        vector.setEntry(0, 5.0);
        vector.setEntry(1, 6.0);
        vector.setEntry(2, 7.0);

        // Multiply matrix with vector
        RealVector resultVector = matrix.operate(vector);

        // Print the result vector
        System.out.println("Resulting Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Additional operations on matrix
        matrix.setEntry(0, 2, 4.0);
        matrix.setEntry(1, 0, 5.0);
        matrix.setEntry(2, 1, 6.0);

        // Read the sparse matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getSparseMatrix(matrix);

        // Print the matrix to verify the values
        System.out.println("Sparse Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform additional matrix operations
        double[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        RealMatrix denseMatrix = MatrixUtils.createRealMatrix(data);
        RealMatrix addedMatrix = matrix.add(denseMatrix);

        // Print the added matrix
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}