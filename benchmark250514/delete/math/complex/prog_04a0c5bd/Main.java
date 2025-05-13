import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a sparse matrix using MatrixUtils
        RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(3, 3);

        // Perform some operations on the matrix if necessary
        sparseMatrix.setEntry(0, 0, 1.0);
        sparseMatrix.setEntry(1, 1, 2.0);
        sparseMatrix.setEntry(2, 2, 3.0);

        // Initialize a dense vector
        RealVector vector = new ArrayRealVector(3);
        vector.setEntry(0, 4.0);
        vector.setEntry(1, 5.0);
        vector.setEntry(2, 6.0);

        // Perform matrix-vector multiplication
        RealVector resultVector = sparseMatrix.operate(vector);

        // Print the result of the matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // More operations on the vector
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.println(scaledVector.getEntry(i));
        }

        // Read the sparse matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = sparseMatrix; // MatrixUtils.getSparseMatrix(sparseMatrix); - hypothetical read method

        // Print the matrix to verify the read operation
        System.out.println("Sparse Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Additional operations on the matrix
        RealMatrix transposedMatrix = readMatrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}