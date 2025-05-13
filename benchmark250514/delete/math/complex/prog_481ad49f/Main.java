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
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        };

        // Create a sparse matrix using MatrixUtils
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(rows, columns, data);

        // Perform some operations on the matrix
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector resultVector = sparseMatrix.operate(vector);

        // Print the result of the matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Create another matrix and add it to the sparse matrix
        double[][] additionalData = {
            {0.0, 0.0, 1.0},
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0}
        };
        RealMatrix additionalMatrix = MatrixUtils.createRealMatrix(additionalData);
        RealMatrix combinedMatrix = sparseMatrix.add(additionalMatrix);

        // Print the combined matrix
        System.out.println("Combined Matrix:");
        for (int i = 0; i < combinedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < combinedMatrix.getColumnDimension(); j++) {
                System.out.print(combinedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the sparse matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getSparseMatrix(sparseMatrix);

        // Print the read matrix to verify the values
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}