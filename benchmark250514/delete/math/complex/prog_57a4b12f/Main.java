import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a sparse matrix with dimensions 2x2 and some values
        double[][] data = {
            {1.0, 0.0},
            {0.0, 2.0}
        };

        // Create another matrix for additional operations
        double[][] additionalData = {
            {3.0, 1.0},
            {1.0, 3.0}
        };

        RealMatrix additionalMatrix = MatrixUtils.createSparseMatrix(additionalData.length, additionalData[0].length, additionalData);

        // Create a vector for matrix-vector multiplication
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0});

        // Perform matrix-vector multiplication
        RealVector resultVector = additionalMatrix.operate(vector);

        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data.length, data[0].length, data);

        // Perform matrix addition with the sparse matrix and additional matrix
        RealMatrix addedMatrix = sparseMatrix.add(additionalMatrix);

        // Print the result of matrix addition
        System.out.println("Result of matrix addition:");
        for (int row = 0; row < addedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < addedMatrix.getColumnDimension(); col++) {
                System.out.print(addedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Assuming getSparseMatrix is a hypothetical method for reading the matrix
        // Since there's no actual `getSparseMatrix` method in MatrixUtils, we simulate reading the matrix
        /* read */ RealMatrix readMatrix = sparseMatrix; // Directly using the matrix for demonstration

        // Print the matrix to verify
        System.out.println("Sparse matrix:");
        for (int row = 0; row < readMatrix.getRowDimension(); row++) {
            for (int col = 0; col < readMatrix.getColumnDimension(); col++) {
                System.out.print(readMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
    }
}